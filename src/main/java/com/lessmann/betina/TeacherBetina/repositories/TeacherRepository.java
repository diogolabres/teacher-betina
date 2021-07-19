package com.lessmann.betina.TeacherBetina.repositories;

import com.lessmann.betina.TeacherBetina.repositories.dao.TeacherDAO;
import com.lessmann.betina.TeacherBetina.standard.StandardRepository;
import com.lessmann.betina.TeacherBetina.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherRepository extends StandardRepository<Teacher, TeacherDAO> {

    @Autowired
    public TeacherRepository(TeacherDAO dao){
        this.dao = dao;
    }

}
