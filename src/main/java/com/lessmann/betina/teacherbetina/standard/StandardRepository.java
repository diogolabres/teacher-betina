package com.lessmann.betina.teacherbetina.standard;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Diogo Labres
 * @param <T> Entity
 * @param <D> DAO of entity
 * 
 * Standard class for standard repository calls.
 */

 public class StandardRepository<T extends StandardEntityInterface, D extends MongoRepository<T, String>> {

    protected D dao;

    public List<T> findAll(){
        return dao.findAll();
    }

    public Page<T> findAll(Pageable page){
        return dao.findAll(page);
    }

    public T save(T toBeSave){
        return dao.save(toBeSave);
    }

    public T findById(String id){
        return dao.findById(id).orElse(null);
    }

    public void deleteById(String id){
        dao.deleteById(id);
    }

 }
