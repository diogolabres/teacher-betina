package com.lessmann.betina.teacherbetina.controllers;

import com.lessmann.betina.teacherbetina.repositories.dao.TeacherDAO;
import com.lessmann.betina.teacherbetina.services.TeacherService;
import com.lessmann.betina.teacherbetina.standard.StandardController;
import com.lessmann.betina.teacherbetina.entities.Teacher;
import com.lessmann.betina.teacherbetina.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teachers")
public class TeacherController extends StandardController<Teacher, TeacherService, TeacherRepository, TeacherDAO> {

    @Autowired
    public TeacherController(TeacherService service){
        this.service = service;
    }

}
