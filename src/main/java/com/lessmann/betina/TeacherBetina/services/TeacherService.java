package com.lessmann.betina.TeacherBetina.services;

import com.lessmann.betina.TeacherBetina.entities.Teacher;
import com.lessmann.betina.TeacherBetina.repositories.TeacherRepository;
import com.lessmann.betina.TeacherBetina.repositories.dao.TeacherDAO;
import com.lessmann.betina.TeacherBetina.standard.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService extends StandardService<Teacher, TeacherRepository, TeacherDAO> {

    @Autowired
    public TeacherService(TeacherRepository repository) {
        this.repository = repository;
    }

}
