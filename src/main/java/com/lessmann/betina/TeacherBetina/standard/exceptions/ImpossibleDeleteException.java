package com.lessmann.betina.TeacherBetina.standard.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ImpossibleDeleteException extends RuntimeException{
    public ImpossibleDeleteException(String message) {
        super(message);
    }
}