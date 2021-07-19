package com.lessmann.betina.TeacherBetina.services;

import com.lessmann.betina.TeacherBetina.dtos.get.ScheduleGet;
import com.lessmann.betina.TeacherBetina.dtos.post.SchedulePost;
import com.lessmann.betina.TeacherBetina.dtos.put.SchedulePut;
import com.lessmann.betina.TeacherBetina.entities.Schedule;
import com.lessmann.betina.TeacherBetina.mappers.ScheduleMapper;
import com.lessmann.betina.TeacherBetina.repositories.ScheduleRepository;
import com.lessmann.betina.TeacherBetina.repositories.dao.ScheduleDAO;
import com.lessmann.betina.TeacherBetina.standard.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService extends StandardService<Schedule, ScheduleGet, SchedulePost, SchedulePut, ScheduleMapper,
        ScheduleRepository, ScheduleDAO> {

    @Autowired
    public ScheduleService(ScheduleRepository repository) {
        this.repository = repository;
        this.mapper = ScheduleMapper.INSTANCE;
    }

}
