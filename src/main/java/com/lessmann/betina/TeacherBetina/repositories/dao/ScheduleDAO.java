package com.lessmann.betina.TeacherBetina.repositories.dao;

import com.lessmann.betina.TeacherBetina.entities.Schedule;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ScheduleDAO extends MongoRepository<Schedule, String> {}