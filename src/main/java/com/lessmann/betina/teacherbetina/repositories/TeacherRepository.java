package com.lessmann.betina.teacherbetina.repositories;

import com.lessmann.betina.teacherbetina.repositories.dao.TeacherDAO;
import com.lessmann.betina.teacherbetina.standard.StandardRepository;
import com.lessmann.betina.teacherbetina.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherRepository extends StandardRepository<Teacher, TeacherDAO> {

    @Autowired
    public TeacherRepository(TeacherDAO dao){
        this.dao = dao;
    }

}
