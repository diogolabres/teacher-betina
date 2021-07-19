package com.lessmann.betina.TeacherBetina.dtos.get;

import com.lessmann.betina.TeacherBetina.entities.Student;
import com.lessmann.betina.TeacherBetina.standard.StandardEntityInterface;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDateTime;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class CourseGet extends RepresentationModel<CourseGet> implements StandardEntityInterface {

    private String id;
    private String name;
    private String description;
    private List<Student> students;
    private LocalDateTime createdAt;

}