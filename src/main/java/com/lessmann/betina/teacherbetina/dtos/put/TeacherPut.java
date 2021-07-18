package com.lessmann.betina.teacherbetina.dtos.put;

import com.lessmann.betina.teacherbetina.standard.StandardPutInterface;
import lombok.Data;

@Data
public class TeacherPut implements StandardPutInterface {

    private String id;
    private String name;
    private String email;
    private String username;
    private String password;

}