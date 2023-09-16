package com.ebuka.hngtasktwo.dto.response;

import com.ebuka.hngtasktwo.data.models.Address;
import com.ebuka.hngtasktwo.data.models.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FetchPersonResponse {
    private String id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Gender gender;
    private Address address;
}
