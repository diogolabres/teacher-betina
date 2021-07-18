package com.lessmann.betina.teacherbetina.dtos.get;

import com.lessmann.betina.teacherbetina.standard.StandardEntityInterface;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
public class TeacherGet implements StandardEntityInterface {

    private String id;
    private String name;
    private String email;
    private String username;
    private LocalDateTime createdAt;

}