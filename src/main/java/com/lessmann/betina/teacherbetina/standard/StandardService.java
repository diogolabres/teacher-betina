package com.lessmann.betina.teacherbetina.standard;

import com.lessmann.betina.teacherbetina.standard.exceptions.ImpossibleDeleteException;
import com.lessmann.betina.teacherbetina.standard.exceptions.RecordNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Diogo Labres
 * @param <T> Entity
 * @param <R> Repository of entity
 * @param <D> DAO of entity
 * 
 * Standard projects layer
 */

public class StandardService<T extends StandardInterface, R extends StandardRepository<T, D>, D extends MongoRepository<T, String>> {

    protected R repository;

    public List <T> findAll() {
        return repository.findAll();
    }

    public Page <T> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public T save(T toBeSave) {
        return repository.save(toBeSave);
    }

    public T update(String id, T toBeSave) {
        findById(id);
        return repository.save(toBeSave);
    }

    public T findById(String id) {
        T f = repository.findById(id);
        if (Objects.isNull(f))
            throw new RecordNotFoundException("Record not found. Please try a valid ID.");
        else
            return f;
    }

    public void deleteById(String id) {
        T f = repository.findById(id);
        if (Objects.isNull(f))
            throw new ImpossibleDeleteException("Record not found. Please try a valid ID.");
        else
            repository.deleteById(id);
    }

    public List<T> saveList(List<T> list) {
        List<T> savedList = new ArrayList<>();
        list.parallelStream().forEach(item -> savedList.add(repository.save(item)));
        return savedList;
    }
}