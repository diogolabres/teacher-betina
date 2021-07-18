package com.lessmann.betina.teacherbetina.entities;

import com.lessmann.betina.teacherbetina.standard.StandardInterface;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Document
@Component
@Data
public class Teacher implements StandardInterface {

    @Id
    private String id;

    private String name;
    private String email;
    private String username;
    private String password;

    private LocalDateTime createdAt = LocalDateTime.now();

}