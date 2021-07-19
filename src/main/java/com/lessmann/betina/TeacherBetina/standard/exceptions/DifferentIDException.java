package com.lessmann.betina.TeacherBetina.standard.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class DifferentIDException extends RuntimeException{
    public DifferentIDException(String message) {
        super(message);
    }
}
