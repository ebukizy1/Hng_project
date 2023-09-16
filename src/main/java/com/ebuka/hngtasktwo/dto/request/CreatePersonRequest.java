package com.ebuka.hngtasktwo.dto.request;

import com.ebuka.hngtasktwo.data.models.Address;
import com.ebuka.hngtasktwo.data.models.Gender;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class CreatePersonRequest {

    private String firstName;

    private String lastName;

    private String emailAddress;

    private Gender gender;
    private Address address;
}
