package com.lessmann.betina.teacherbetina.controllers;

import com.lessmann.betina.teacherbetina.entities.Student;
import com.lessmann.betina.teacherbetina.repositories.StudentRepository;
import com.lessmann.betina.teacherbetina.repositories.dao.StudentDAO;
import com.lessmann.betina.teacherbetina.services.StudentService;
import com.lessmann.betina.teacherbetina.standard.StandardController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController extends StandardController<Student, StudentService, StudentRepository, StudentDAO> {

    @Autowired
    public StudentController(StudentService service){
        this.service = service;
    }

}
