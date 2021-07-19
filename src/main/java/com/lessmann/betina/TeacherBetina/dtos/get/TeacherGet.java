package com.lessmann.betina.TeacherBetina.dtos.get;

import com.lessmann.betina.TeacherBetina.standard.StandardEntityInterface;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
public class TeacherGet extends RepresentationModel<TeacherGet> implements StandardEntityInterface {

    private String id;
    private String name;
    private String email;
    private String username;
    private LocalDateTime createdAt;

}