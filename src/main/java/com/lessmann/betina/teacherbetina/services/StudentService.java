package com.lessmann.betina.teacherbetina.services;

import com.lessmann.betina.teacherbetina.entities.Student;
import com.lessmann.betina.teacherbetina.repositories.StudentRepository;
import com.lessmann.betina.teacherbetina.repositories.dao.StudentDAO;
import com.lessmann.betina.teacherbetina.standard.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService extends StandardService<Student, StudentRepository, StudentDAO> {

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

}
