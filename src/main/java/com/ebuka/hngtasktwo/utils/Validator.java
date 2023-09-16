package com.ebuka.hngtasktwo.utils;


import com.ebuka.hngtasktwo.dto.request.CreatePersonRequest;
import com.ebuka.hngtasktwo.exception.PersonEmailAddressException;
import com.ebuka.hngtasktwo.exception.PersonNotExistException;
import com.ebuka.hngtasktwo.exception.PersonValueCantBeNullException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validator {


    public Validator() {
        //to hide the one java give implicitly
    }

    public static void validateCreatePerson(CreatePersonRequest createPersonRequest) {
        validateNotNull(createPersonRequest.getFirstName());
        validateNotBlank(createPersonRequest.getFirstName());
        validateNotBlank(createPersonRequest.getLastName());
        validateNotNull(createPersonRequest.getLastName());
        validateNotBlank(createPersonRequest.getAddress().getCountry());
        validateNotNull(createPersonRequest.getAddress().getCountry());
        validateNotNull(createPersonRequest.getGender().name());
        validateNotBlank(createPersonRequest.getGender().name());
        validateNotBlank(createPersonRequest.getAddress().getState());
        validateNotNull(createPersonRequest.getAddress().getState());
        validateNotNull(createPersonRequest.getAddress().getStreetAddress());
        validateNotBlank(createPersonRequest.getAddress().getStreetAddress());
        validateNotNull(createPersonRequest.getAddress().getCity());
        validateNotBlank(createPersonRequest.getAddress().getCity());
    }

    private static void validateNotNull(String value) {
        if (value == null) {
            throw new PersonValueCantBeNullException(" invalid input field. Please provide the valid input");
        }
    }

    private static void validateNotBlank(String value) {
        if (value.trim().isEmpty()) {
            throw new PersonNotExistException("invalid input field. Please provide the valid input");
        }
    }
    public static void validateEmail(String email) {
        String pattern = "^[A-Za-z0-9]{4,}@(gmail\\.com|yahoo\\.com)$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(email);
        if (!matcher.find()) {
            throw new PersonEmailAddressException("Invalid email address " + "email can either example@gmail.com/@yahoo.com");
        }
    }
}
