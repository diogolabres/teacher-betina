package com.lessmann.betina.teacherbetina.services;

import com.lessmann.betina.teacherbetina.entities.Course;
import com.lessmann.betina.teacherbetina.repositories.CourseRepository;
import com.lessmann.betina.teacherbetina.repositories.dao.CourseDAO;
import com.lessmann.betina.teacherbetina.standard.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService extends StandardService<Course, CourseRepository, CourseDAO> {

    @Autowired
    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

}
