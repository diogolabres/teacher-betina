package com.lessmann.betina.TeacherBetina.dtos.get;

import com.lessmann.betina.TeacherBetina.entities.Course;
import com.lessmann.betina.TeacherBetina.entities.Student;
import com.lessmann.betina.TeacherBetina.entities.Teacher;
import com.lessmann.betina.TeacherBetina.standard.StandardEntityInterface;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDateTime;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class ScheduleGet extends RepresentationModel<ScheduleGet> implements StandardEntityInterface {

    private String id;
    private LocalDateTime dateTime;
    private Course course;
    private List<Student> students;
    private List<Student> presents;
    private List<Teacher> teachers;
    private LocalDateTime createdAt;

}