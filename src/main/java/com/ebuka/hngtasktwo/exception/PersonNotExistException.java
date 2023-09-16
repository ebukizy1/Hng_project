package com.ebuka.hngtasktwo.exception;

public class PersonNotExistException extends RuntimeException{

    public PersonNotExistException(String message) {
        super(message);
    }
}
