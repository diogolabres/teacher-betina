package com.lessmann.betina.TeacherBetina.dtos.post;

import com.lessmann.betina.TeacherBetina.entities.Course;
import com.lessmann.betina.TeacherBetina.entities.Student;
import com.lessmann.betina.TeacherBetina.entities.Teacher;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class SchedulePost {

    private LocalDateTime dateTime;
    private Course course;
    private List<Student> students;
    private List<Student> presents;
    private List<Teacher> teachers;

}