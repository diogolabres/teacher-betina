package com.lessmann.betina.teacherbetina.repositories.dao;

import com.lessmann.betina.teacherbetina.entities.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentDAO extends MongoRepository<Student, String> {}