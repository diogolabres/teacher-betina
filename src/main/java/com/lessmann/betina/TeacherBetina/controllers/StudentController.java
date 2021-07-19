package com.lessmann.betina.TeacherBetina.controllers;

import com.lessmann.betina.TeacherBetina.dtos.get.StudentGet;
import com.lessmann.betina.TeacherBetina.dtos.post.StudentPost;
import com.lessmann.betina.TeacherBetina.dtos.put.StudentPut;
import com.lessmann.betina.TeacherBetina.entities.Student;
import com.lessmann.betina.TeacherBetina.mappers.StudentMapper;
import com.lessmann.betina.TeacherBetina.repositories.StudentRepository;
import com.lessmann.betina.TeacherBetina.repositories.dao.StudentDAO;
import com.lessmann.betina.TeacherBetina.services.StudentService;
import com.lessmann.betina.TeacherBetina.standard.StandardController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController extends StandardController<Student, StudentGet, StudentPost, StudentPut, StudentMapper,
        StudentService, StudentRepository, StudentDAO> {

    @Autowired
    public StudentController(StudentService service){
        this.service = service;
    }

}
