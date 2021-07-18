package com.lessmann.betina.teacherbetina.entities;

import com.lessmann.betina.teacherbetina.standard.StandardInterface;
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
public class Course implements StandardInterface {

    @Id
    private String id;

    private String name;
    private String description;

    @DBRef
    private List<Student> students;

    private LocalDateTime createdAt = LocalDateTime.now();

}