package com.lessmann.betina.TeacherBetina.dtos.post;

import com.lessmann.betina.TeacherBetina.entities.Student;
import lombok.Data;

import java.util.List;

@Data
public class CoursePost {

    private String name;
    private String description;
    private List<Student> students;

}