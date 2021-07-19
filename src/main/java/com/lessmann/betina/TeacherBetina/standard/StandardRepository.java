package com.lessmann.betina.TeacherBetina.standard;

import com.lessmann.betina.TeacherBetina.standard.exceptions.DifferentIDException;
import com.lessmann.betina.TeacherBetina.standard.exceptions.ImpossibleDeleteException;
import com.lessmann.betina.TeacherBetina.standard.exceptions.RecordNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public class StandardRepository<ENTITY extends StandardEntityInterface, DAO extends MongoRepository<ENTITY, String>> {

    protected DAO dao;

    public List<ENTITY> findAll() {
        return dao.findAll();
    }

    public Page<ENTITY> findAll(Pageable page) {
        return dao.findAll(page);
    }

    public ENTITY save(ENTITY toBeSave) {
        return dao.save(toBeSave);
    }

    public ENTITY update(String id, ENTITY toBeSave) {
        if(!id.equals(toBeSave.getId())){
            throw new DifferentIDException("The ID on the path is different to object ID. PathID: " + id +
                    ", ObjectID: " + toBeSave.getId());
        }
        findById(id);
        return dao.save(toBeSave);
    }

    public ENTITY findById(String id) {
        return dao.findById(id).orElseThrow(() -> new RecordNotFoundException("Record not found. ID: " + id));
    }

    public void deleteById(String id) {
        dao.findById(id).orElseThrow(() -> new ImpossibleDeleteException("You can't delete something that does not exist. ID: " + id));
        dao.deleteById(id);
    }

}
