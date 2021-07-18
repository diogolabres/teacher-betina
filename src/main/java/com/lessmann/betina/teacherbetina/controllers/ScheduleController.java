package com.lessmann.betina.teacherbetina.controllers;

import com.lessmann.betina.teacherbetina.entities.Schedule;
import com.lessmann.betina.teacherbetina.repositories.ScheduleRepository;
import com.lessmann.betina.teacherbetina.repositories.dao.ScheduleDAO;
import com.lessmann.betina.teacherbetina.services.ScheduleService;
import com.lessmann.betina.teacherbetina.standard.StandardController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedules")
public class ScheduleController extends StandardController<Schedule, ScheduleService, ScheduleRepository, ScheduleDAO> {

    @Autowired
    public ScheduleController(ScheduleService service){
        this.service = service;
    }

}
