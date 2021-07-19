package com.lessmann.betina.TeacherBetina.standard;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public class StandardService<ENTITY extends StandardEntityInterface, GET extends StandardEntityInterface, POST,
        PUT extends StandardPutInterface, MAPPER extends StandardMapperInterface<ENTITY, GET, POST, PUT>,
        REPOSITORY extends StandardRepository<ENTITY, DAO>, DAO extends MongoRepository<ENTITY, String>> {

    protected REPOSITORY repository;
    protected MAPPER mapper;

    public List<GET> findAll() {
        return mapper.toDTOList(repository.findAll());
    }

    public Page<GET> findAll(Pageable pageable) {
        Page<ENTITY> page = repository.findAll(pageable);
        return new PageImpl<>(mapper.toDTOList(page.getContent()), pageable, page.getTotalElements());
    }

    public GET save(POST post) {
        return mapper.toDTO(repository.save(mapper.toEntity(post)));
    }

    public GET update(String id, PUT put) {
        return mapper.toDTO(repository.update(id, mapper.toEntity(put)));
    }

    public GET findById(String id) {
        ENTITY found = repository.findById(id);
        return mapper.toDTO(found);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

}