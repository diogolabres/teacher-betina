package com.lessmann.betina.teacherbetina.repositories.dao;

import com.lessmann.betina.teacherbetina.entities.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherDAO extends MongoRepository<Teacher, String> {}