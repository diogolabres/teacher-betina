package com.lessmann.betina.TeacherBetina.repositories.dao;

import com.lessmann.betina.TeacherBetina.entities.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentDAO extends MongoRepository<Student, String> {}