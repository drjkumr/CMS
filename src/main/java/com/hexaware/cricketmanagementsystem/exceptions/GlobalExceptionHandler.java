package com.hexaware.cricketmanagementsystem.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(PlayerNotFoundException.class)
    public ResponseEntity<String> handlePlayerNotFound(PlayerNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);  //Not found exception for non-existing player
    }

    @ExceptionHandler(InvalidJerseyNumberException.class)
    public ResponseEntity<String> handleInvalidJerseyNumber(InvalidJerseyNumberException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST); //BAD request for handling if jersey number > 22 or < 1
    }

}