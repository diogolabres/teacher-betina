package com.lessmann.betina.teacherbetina.repositories.dao;

import com.lessmann.betina.teacherbetina.entities.Schedule;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ScheduleDAO extends MongoRepository<Schedule, String> {}