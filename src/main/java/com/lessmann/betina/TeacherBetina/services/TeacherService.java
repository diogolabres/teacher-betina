package com.lessmann.betina.TeacherBetina.services;

import com.lessmann.betina.TeacherBetina.dtos.get.TeacherGet;
import com.lessmann.betina.TeacherBetina.dtos.post.TeacherPost;
import com.lessmann.betina.TeacherBetina.dtos.put.TeacherPut;
import com.lessmann.betina.TeacherBetina.entities.Teacher;
import com.lessmann.betina.TeacherBetina.mappers.TeacherMapper;
import com.lessmann.betina.TeacherBetina.repositories.TeacherRepository;
import com.lessmann.betina.TeacherBetina.repositories.dao.TeacherDAO;
import com.lessmann.betina.TeacherBetina.standard.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService extends StandardService<Teacher, TeacherGet, TeacherPost, TeacherPut, TeacherMapper,
        TeacherRepository, TeacherDAO> {

    @Autowired
    public TeacherService(TeacherRepository repository) {
        this.repository = repository;
        this.mapper = TeacherMapper.INSTANCE;
    }

}
