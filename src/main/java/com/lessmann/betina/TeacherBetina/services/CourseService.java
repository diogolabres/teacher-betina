package com.lessmann.betina.TeacherBetina.services;

import com.lessmann.betina.TeacherBetina.dtos.get.CourseGet;
import com.lessmann.betina.TeacherBetina.dtos.post.CoursePost;
import com.lessmann.betina.TeacherBetina.dtos.put.CoursePut;
import com.lessmann.betina.TeacherBetina.entities.Course;
import com.lessmann.betina.TeacherBetina.mappers.CourseMapper;
import com.lessmann.betina.TeacherBetina.repositories.CourseRepository;
import com.lessmann.betina.TeacherBetina.repositories.dao.CourseDAO;
import com.lessmann.betina.TeacherBetina.standard.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService extends StandardService<Course, CourseGet, CoursePost, CoursePut, CourseMapper,
        CourseRepository, CourseDAO> {

    @Autowired
    public CourseService(CourseRepository repository) {
        this.repository = repository;
        this.mapper = CourseMapper.INSTANCE;
    }

}
