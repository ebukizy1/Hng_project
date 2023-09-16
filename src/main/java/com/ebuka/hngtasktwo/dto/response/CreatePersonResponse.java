package com.ebuka.hngtasktwo.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreatePersonResponse {
    private String id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String message;

}
