package com.lessmann.betina.teacherbetina.controllers;

import com.lessmann.betina.teacherbetina.entities.Course;
import com.lessmann.betina.teacherbetina.repositories.CourseRepository;
import com.lessmann.betina.teacherbetina.repositories.dao.CourseDAO;
import com.lessmann.betina.teacherbetina.services.CourseService;
import com.lessmann.betina.teacherbetina.standard.StandardController;
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
