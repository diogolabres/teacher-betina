package com.lessmann.betina.TeacherBetina.dtos.put;

import com.lessmann.betina.TeacherBetina.entities.Course;
import com.lessmann.betina.TeacherBetina.entities.Student;
import com.lessmann.betina.TeacherBetina.entities.Teacher;
import com.lessmann.betina.TeacherBetina.standard.StandardPutInterface;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class SchedulePut implements StandardPutInterface {

    private String id;
    private LocalDateTime dateTime;
    private Course course;
    private List<Student> students;
    private List<Student> presents;
    private List<Teacher> teachers;

}