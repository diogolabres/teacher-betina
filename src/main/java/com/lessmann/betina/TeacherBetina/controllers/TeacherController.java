package com.lessmann.betina.TeacherBetina.controllers;

import com.lessmann.betina.TeacherBetina.dtos.get.TeacherGet;
import com.lessmann.betina.TeacherBetina.dtos.post.TeacherPost;
import com.lessmann.betina.TeacherBetina.dtos.put.TeacherPut;
import com.lessmann.betina.TeacherBetina.mappers.TeacherMapper;
import com.lessmann.betina.TeacherBetina.repositories.dao.TeacherDAO;
import com.lessmann.betina.TeacherBetina.services.TeacherService;
import com.lessmann.betina.TeacherBetina.standard.StandardController;
import com.lessmann.betina.TeacherBetina.entities.Teacher;
import com.lessmann.betina.TeacherBetina.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teachers")
public class TeacherController extends StandardController<Teacher, TeacherGet, TeacherPost, TeacherPut, TeacherMapper,
        TeacherService, TeacherRepository, TeacherDAO> {

    @Autowired
    public TeacherController(TeacherService service){
        this.service = service;
    }

}
