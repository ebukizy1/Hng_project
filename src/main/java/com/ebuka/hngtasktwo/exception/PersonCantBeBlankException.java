package com.ebuka.hngtasktwo.exception;

public class PersonCantBeBlankException extends RuntimeException{

    public PersonCantBeBlankException(String message) {
        super(message);
    }
}
