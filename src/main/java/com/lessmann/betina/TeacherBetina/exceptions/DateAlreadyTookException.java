package com.lessmann.betina.TeacherBetina.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class DateAlreadyTookException extends RuntimeException {
    public DateAlreadyTookException(String message) {
        super(message);
    }
}