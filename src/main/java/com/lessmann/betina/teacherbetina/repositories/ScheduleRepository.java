package com.lessmann.betina.teacherbetina.repositories;

import com.lessmann.betina.teacherbetina.entities.Schedule;
import com.lessmann.betina.teacherbetina.repositories.dao.ScheduleDAO;
import com.lessmann.betina.teacherbetina.standard.StandardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScheduleRepository extends StandardRepository<Schedule, ScheduleDAO> {

    @Autowired
    public ScheduleRepository(ScheduleDAO dao){
        this.dao = dao;
    }

}
