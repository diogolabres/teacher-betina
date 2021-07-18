package com.lessmann.betina.TeacherBetina.standard;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Diogo Labres
 * @param <T> Entity
 * @param <S> Service of entity
 * @param <R> Repository of entity
 * @param <D> DAO of entity
 * 
 * Control layer with standard endpoints
 */

public class StandardController<T extends StandardInterface, S extends StandardService<T, R, D>, R extends StandardRepository<T, D>, D extends MongoRepository<T, String>> {

    protected S service;

    @GetMapping
    public Page<T> pagination(@PageableDefault(direction = Sort.Direction.ASC, size = 50) Pageable pageRequest) {
        return service.findAll(pageRequest);
    }

    @GetMapping("/list")
    public List<T> list() {
        return service.findAll();
    }

    @PostMapping("/list")
    public List<T> addList(@RequestBody final List<T> list) {
        return service.saveList(list);
    }

    @PostMapping
    public T add(@RequestBody final T toBeSave) {
        return service.save(toBeSave);
    }

    @PutMapping("/{id}")
    public T edit(@PathVariable final String id, @RequestBody final T toBeUpdate) {
        return service.update(id, toBeUpdate);
    }

    @GetMapping("/{id}")
    public T byId(@PathVariable final String id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable final String id) {
        service.deleteById(id);
    }

}