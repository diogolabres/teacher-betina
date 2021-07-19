package com.lessmann.betina.TeacherBetina.repositories.dao;

import com.lessmann.betina.TeacherBetina.entities.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseDAO extends MongoRepository<Course, String> {}