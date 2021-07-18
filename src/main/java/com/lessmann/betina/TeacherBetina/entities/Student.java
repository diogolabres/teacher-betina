package com.lessmann.betina.TeacherBetina.entities;

import com.lessmann.betina.TeacherBetina.standard.StandardInterface;
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
public class Student implements StandardInterface {

    @Id
    private String id;

    private String name;
    private String email;
    private String username;
    private String password;

    @DBRef
    private List<Course> courses;

    private LocalDateTime createdAt = LocalDateTime.now();

}