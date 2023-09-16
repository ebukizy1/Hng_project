package com.ebuka.hngtasktwo.controller;

import com.ebuka.hngtasktwo.dto.response.ValidationErrorResponse;
import com.ebuka.hngtasktwo.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class ValidationControllerAdvice {

    @ExceptionHandler(PersonNotExistException.class)
    public ResponseEntity<ValidationErrorResponse> validatePersonNotExistException(PersonNotExistException ex){
        ValidationErrorResponse errorResponse = new ValidationErrorResponse();
        errorResponse.setErrorCode(400);
        errorResponse.setErrorMessage(ex.getMessage());
        errorResponse.setTimestamp(new Date());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(PersonAlreadyExistException.class)
    public ResponseEntity<ValidationErrorResponse> validatePersonAlreadyExist(PersonAlreadyExistException ex){
        ValidationErrorResponse errorResponse = new ValidationErrorResponse();
        errorResponse.setErrorCode(400);
        errorResponse.setErrorMessage(ex.getMessage());
        errorResponse.setTimestamp(new Date());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(PersonCantBeBlankException.class)
    public ResponseEntity<ValidationErrorResponse> validatePersonAlreadyExist(PersonCantBeBlankException ex){
        ValidationErrorResponse errorResponse = new ValidationErrorResponse();
        errorResponse.setErrorCode(400);
        errorResponse.setErrorMessage(ex.getMessage());
        errorResponse.setTimestamp(new Date());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);

}
    @ExceptionHandler(PersonEmailAddressException.class)
    public ResponseEntity<ValidationErrorResponse> validatePersonAlreadyExist(PersonEmailAddressException ex){
        ValidationErrorResponse errorResponse = new ValidationErrorResponse();
        errorResponse.setErrorCode(400);
        errorResponse.setErrorMessage(ex.getMessage());
        errorResponse.setTimestamp(new Date());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);

    }
    @ExceptionHandler(PersonValueCantBeNullException.class)
    public ResponseEntity<ValidationErrorResponse> validatePersonAlreadyExist(PersonValueCantBeNullException ex){
        ValidationErrorResponse errorResponse = new ValidationErrorResponse();
        errorResponse.setErrorCode(400);
        errorResponse.setErrorMessage(ex.getMessage());
        errorResponse.setTimestamp(new Date());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);

    }


    }
