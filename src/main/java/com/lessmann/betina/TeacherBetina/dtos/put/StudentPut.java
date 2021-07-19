package com.lessmann.betina.TeacherBetina.dtos.put;

import com.lessmann.betina.TeacherBetina.entities.Course;
import com.lessmann.betina.TeacherBetina.standard.StandardPutInterface;
import lombok.Data;

import java.util.List;

@Data
public class StudentPut implements StandardPutInterface {

    private String id;
    private String name;
    private String email;
    private String username;
    private List<Course> courses;

}