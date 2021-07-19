package com.lessmann.betina.TeacherBetina.services;

import com.lessmann.betina.TeacherBetina.dtos.get.StudentGet;
import com.lessmann.betina.TeacherBetina.dtos.post.StudentPost;
import com.lessmann.betina.TeacherBetina.dtos.put.StudentPut;
import com.lessmann.betina.TeacherBetina.entities.Student;
import com.lessmann.betina.TeacherBetina.mappers.StudentMapper;
import com.lessmann.betina.TeacherBetina.repositories.StudentRepository;
import com.lessmann.betina.TeacherBetina.repositories.dao.StudentDAO;
import com.lessmann.betina.TeacherBetina.standard.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService extends StandardService<Student, StudentGet, StudentPost, StudentPut, StudentMapper,
        StudentRepository, StudentDAO> {

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
        this.mapper = StudentMapper.INSTANCE;
    }

}
