package com.lessmann.betina.TeacherBetina.dtos.post;

import com.lessmann.betina.TeacherBetina.entities.Course;
import lombok.Data;

import java.util.List;

@Data
public class StudentPost {

    private String name;
    private String email;
    private String username;
    private String password;
    private List<Course> courses;

}