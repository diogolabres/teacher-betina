package com.lessmann.betina.TeacherBetina.controllers;

import com.lessmann.betina.TeacherBetina.entities.Course;
import com.lessmann.betina.TeacherBetina.repositories.CourseRepository;
import com.lessmann.betina.TeacherBetina.repositories.dao.CourseDAO;
import com.lessmann.betina.TeacherBetina.services.CourseService;
import com.lessmann.betina.TeacherBetina.standard.StandardController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController extends StandardController<Course, CourseService, CourseRepository, CourseDAO> {

    @Autowired
    public CourseController(CourseService service){
        this.service = service;
    }

}
