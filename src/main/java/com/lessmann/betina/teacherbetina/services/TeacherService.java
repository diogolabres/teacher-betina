package com.lessmann.betina.teacherbetina.services;

import com.lessmann.betina.teacherbetina.entities.Teacher;
import com.lessmann.betina.teacherbetina.repositories.TeacherRepository;
import com.lessmann.betina.teacherbetina.repositories.dao.TeacherDAO;
import com.lessmann.betina.teacherbetina.standard.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService extends StandardService<Teacher, TeacherRepository, TeacherDAO> {

    @Autowired
    public TeacherService(TeacherRepository repository) {
        this.repository = repository;
    }

}
