package com.lessmann.betina.TeacherBetina.dtos.put;

import com.lessmann.betina.TeacherBetina.entities.Student;
import com.lessmann.betina.TeacherBetina.standard.StandardPutInterface;
import lombok.Data;

import java.util.List;

@Data
public class CoursePut implements StandardPutInterface {

    private String id;
    private String name;
    private String description;
    private List<Student> students;

}