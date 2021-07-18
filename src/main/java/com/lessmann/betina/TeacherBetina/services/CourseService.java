package com.lessmann.betina.TeacherBetina.services;

import com.lessmann.betina.TeacherBetina.entities.Course;
import com.lessmann.betina.TeacherBetina.repositories.CourseRepository;
import com.lessmann.betina.TeacherBetina.repositories.dao.CourseDAO;
import com.lessmann.betina.TeacherBetina.standard.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService extends StandardService<Course, CourseRepository, CourseDAO> {

    @Autowired
    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

}
