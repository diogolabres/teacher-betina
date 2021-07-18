package com.lessmann.betina.TeacherBetina.controllers;

import com.lessmann.betina.TeacherBetina.entities.Schedule;
import com.lessmann.betina.TeacherBetina.entities.Teacher;
import com.lessmann.betina.TeacherBetina.repositories.ScheduleRepository;
import com.lessmann.betina.TeacherBetina.repositories.TeacherRepository;
import com.lessmann.betina.TeacherBetina.repositories.dao.ScheduleDAO;
import com.lessmann.betina.TeacherBetina.repositories.dao.TeacherDAO;
import com.lessmann.betina.TeacherBetina.services.ScheduleService;
import com.lessmann.betina.TeacherBetina.services.TeacherService;
import com.lessmann.betina.TeacherBetina.standard.StandardController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teachers")
public class ScheduleController extends StandardController<Schedule, ScheduleService, ScheduleRepository, ScheduleDAO> {

    @Autowired
    public ScheduleController(ScheduleService service){
        this.service = service;
    }

}