package com.lessmann.betina.TeacherBetina.handlers;

import com.lessmann.betina.TeacherBetina.errors.RuntimeExceptionDetails;
import com.lessmann.betina.TeacherBetina.standard.exceptions.ImpossibleDeleteException;
import com.lessmann.betina.TeacherBetina.standard.exceptions.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<RuntimeExceptionDetails> handlerRuntimeException(RuntimeException exception){
        return new ResponseEntity<>(
                RuntimeExceptionDetails.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.BAD_REQUEST.value())
                        .title("Bad Request Exception, Check the Documentation")
                        .details(exception.getMessage())
                        .developerMessage(exception.getClass().getName())
                        .build(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ImpossibleDeleteException.class)
    public ResponseEntity<RuntimeExceptionDetails> handlerImpossibleDeleteException(ImpossibleDeleteException exception){
        return new ResponseEntity<>(
                RuntimeExceptionDetails.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.NOT_FOUND.value())
                        .title("Bad Request Exception, Check the Documentation")
                        .details(exception.getMessage())
                        .developerMessage(exception.getClass().getName())
                        .build(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity<RuntimeExceptionDetails> handlerRecordNotFoundException(RecordNotFoundException exception){
        return new ResponseEntity<>(
                RuntimeExceptionDetails.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.NOT_FOUND.value())
                        .title("Bad Request Exception, Check the Documentation")
                        .details(exception.getMessage())
                        .developerMessage(exception.getClass().getName())
                        .build(), HttpStatus.NOT_FOUND);
    }
}
