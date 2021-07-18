package com.lessmann.betina.TeacherBetina.services;

import com.lessmann.betina.TeacherBetina.entities.Student;
import com.lessmann.betina.TeacherBetina.repositories.StudentRepository;
import com.lessmann.betina.TeacherBetina.repositories.dao.StudentDAO;
import com.lessmann.betina.TeacherBetina.standard.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService extends StandardService<Student, StudentRepository, StudentDAO> {

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

}
