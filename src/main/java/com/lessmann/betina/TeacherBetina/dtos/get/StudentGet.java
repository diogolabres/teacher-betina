package com.lessmann.betina.TeacherBetina.dtos.get;

import com.lessmann.betina.TeacherBetina.entities.Course;
import com.lessmann.betina.TeacherBetina.standard.StandardEntityInterface;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDateTime;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class StudentGet extends RepresentationModel<StudentGet> implements StandardEntityInterface {

    private String id;
    private String name;
    private String email;
    private String username;
    private List<Course> courses;
    private LocalDateTime createdAt;

}