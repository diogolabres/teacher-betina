package com.lessmann.betina.TeacherBetina.repositories;

import com.lessmann.betina.TeacherBetina.entities.Course;
import com.lessmann.betina.TeacherBetina.repositories.dao.CourseDAO;
import com.lessmann.betina.TeacherBetina.standard.StandardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository extends StandardRepository<Course, CourseDAO> {

    @Autowired
    public CourseRepository(CourseDAO dao){
        this.dao = dao;
    }

}
