package com.lessmann.betina.teacherbetina.repositories.dao;

import com.lessmann.betina.teacherbetina.entities.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseDAO extends MongoRepository<Course, String> {}