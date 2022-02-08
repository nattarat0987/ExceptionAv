package com.example.testException.Exceptionbase;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;


@ControllerAdvice
public class ControAv {

    @ExceptionHandler(ProductEx.class)
    public ResponseEntity<ResponseException> response(ProductEx ex){
        ResponseException exception = new ResponseException();
        exception.setError(ex.getMessage());
        exception.setStatus(HttpStatus.EXPECTATION_FAILED.value());
        return new ResponseEntity<>(exception,HttpStatus.EXPECTATION_FAILED);
    }


    @Data
    public static class ResponseException{
        LocalDateTime dateTime = LocalDateTime.now();
        private int status;
        private String error;
    }

}
