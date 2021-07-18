package com.lessmann.betina.TeacherBetina.services;

import com.lessmann.betina.TeacherBetina.entities.Schedule;
import com.lessmann.betina.TeacherBetina.repositories.ScheduleRepository;
import com.lessmann.betina.TeacherBetina.repositories.dao.ScheduleDAO;
import com.lessmann.betina.TeacherBetina.standard.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService extends StandardService<Schedule, ScheduleRepository, ScheduleDAO> {

    @Autowired
    public ScheduleService(ScheduleRepository repository) {
        this.repository = repository;
    }

}
