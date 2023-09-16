package com.ebuka.hngtasktwo.dto.response;

import com.ebuka.hngtasktwo.data.models.Address;
import com.ebuka.hngtasktwo.data.models.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdatePersonResponse {

    private String firstName;

    private String lastName;

    private Gender gender;

    private Address address;
}
