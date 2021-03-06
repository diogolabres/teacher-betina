package com.lessmann.betina.TeacherBetina.controllers;

import com.lessmann.betina.TeacherBetina.dtos.get.ScheduleGet;
import com.lessmann.betina.TeacherBetina.dtos.post.SchedulePost;
import com.lessmann.betina.TeacherBetina.dtos.put.SchedulePut;
import com.lessmann.betina.TeacherBetina.entities.Schedule;
import com.lessmann.betina.TeacherBetina.mappers.ScheduleMapper;
import com.lessmann.betina.TeacherBetina.repositories.ScheduleRepository;
import com.lessmann.betina.TeacherBetina.repositories.dao.ScheduleDAO;
import com.lessmann.betina.TeacherBetina.services.ScheduleService;
import com.lessmann.betina.TeacherBetina.standard.StandardController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedules")
public class ScheduleController extends StandardController<Schedule, ScheduleGet, SchedulePost, SchedulePut,
        ScheduleMapper, ScheduleService, ScheduleRepository, ScheduleDAO> {

    @Autowired
    public ScheduleController(ScheduleService service){
        this.service = service;
    }

}
