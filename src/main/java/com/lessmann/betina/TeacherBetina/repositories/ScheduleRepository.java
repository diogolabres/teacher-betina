package com.lessmann.betina.TeacherBetina.repositories;

import com.lessmann.betina.TeacherBetina.entities.Schedule;
import com.lessmann.betina.TeacherBetina.repositories.dao.ScheduleDAO;
import com.lessmann.betina.TeacherBetina.standard.StandardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScheduleRepository extends StandardRepository<Schedule, ScheduleDAO> {

    @Autowired
    public ScheduleRepository(ScheduleDAO dao){
        this.dao = dao;
    }

}
