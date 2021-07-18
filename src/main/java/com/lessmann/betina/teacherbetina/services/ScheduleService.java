package com.lessmann.betina.teacherbetina.services;

import com.lessmann.betina.teacherbetina.entities.Schedule;
import com.lessmann.betina.teacherbetina.repositories.ScheduleRepository;
import com.lessmann.betina.teacherbetina.repositories.dao.ScheduleDAO;
import com.lessmann.betina.teacherbetina.standard.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService extends StandardService<Schedule, ScheduleRepository, ScheduleDAO> {

    @Autowired
    public ScheduleService(ScheduleRepository repository) {
        this.repository = repository;
    }

}
