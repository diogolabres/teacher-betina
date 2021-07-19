package com.lessmann.betina.TeacherBetina.handlers;

import com.lessmann.betina.TeacherBetina.errors.RuntimeExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<RuntimeExceptionDetails> handlerRuntimeException(RuntimeException runtimeException){
        return new ResponseEntity<>(
                RuntimeExceptionDetails.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.BAD_REQUEST.value())
                        .title("Bad Request Exception, Check the Documentation")
                        .details(runtimeException.getMessage())
                        .developerMessage(runtimeException.getClass().getName())
                        .build(), HttpStatus.BAD_REQUEST);
    }
}
