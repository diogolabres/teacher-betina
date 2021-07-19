package com.lessmann.betina.TeacherBetina.entities;

import com.lessmann.betina.TeacherBetina.standard.StandardEntityInterface;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Document
@Component
@Data
public class Schedule implements StandardEntityInterface {

    @Id
    private String id;

    private LocalDateTime dateTime;

    @DBRef
    private Course course;

    @DBRef
    private List<Student> students;

    @DBRef
    private List<Student> presents;

    @DBRef
    private List<Teacher> teachers;

    private LocalDateTime createdAt = LocalDateTime.now();

}