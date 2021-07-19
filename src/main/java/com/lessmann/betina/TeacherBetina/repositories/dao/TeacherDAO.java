package com.lessmann.betina.TeacherBetina.repositories.dao;

import com.lessmann.betina.TeacherBetina.entities.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherDAO extends MongoRepository<Teacher, String> {}