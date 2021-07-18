package com.lessmann.betina.teacherbetina.repositories;

import com.lessmann.betina.teacherbetina.entities.Course;
import com.lessmann.betina.teacherbetina.repositories.dao.CourseDAO;
import com.lessmann.betina.teacherbetina.standard.StandardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository extends StandardRepository<Course, CourseDAO> {

    @Autowired
    public CourseRepository(CourseDAO dao){
        this.dao = dao;
    }

}
