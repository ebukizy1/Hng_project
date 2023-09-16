package com.ebuka.hngtasktwo.utils;


import com.ebuka.hngtasktwo.data.models.Address;
import com.ebuka.hngtasktwo.data.models.Persons;
import com.ebuka.hngtasktwo.dto.request.CreatePersonRequest;
import com.ebuka.hngtasktwo.dto.request.UpdatePersonRequest;
import com.ebuka.hngtasktwo.dto.response.CreatePersonResponse;
import com.ebuka.hngtasktwo.dto.response.FetchPersonResponse;
import com.ebuka.hngtasktwo.dto.response.UpdatePersonResponse;

public class Mapper {

    public static void mapFetchPersonResponse(FetchPersonResponse fetchPersonResponse, Persons foundPerson) {
//        fetchPersonResponse.setId(foundPerson.getId());
        fetchPersonResponse.setFirstName(foundPerson.getFirstName());
        fetchPersonResponse.setLastName(foundPerson.getLastName());
        fetchPersonResponse.setEmailAddress(foundPerson.getEmailAddress());
        fetchPersonResponse.setGender(foundPerson.getGender());
        fetchPersonResponse.setAddress(foundPerson.getAddress());
    }
    public static void mapCreatePersonRequest(CreatePersonRequest createPersonRequest, Address address, Persons persons) {
        address.setCountry(createPersonRequest.getAddress().getCountry());
        address.setState(createPersonRequest.getAddress().getState());
        address.setCity(createPersonRequest.getAddress().getCity());
        address.setStreetAddress(createPersonRequest.getAddress().getStreetAddress());

        persons.setFirstName(createPersonRequest.getFirstName());
        persons.setLastName(createPersonRequest.getLastName());
        persons.setEmailAddress(createPersonRequest.getEmailAddress());
        persons.setGender(createPersonRequest.getGender());
        persons.setAddress(address);
    }
    public static void mapCreatePersonResponse(CreatePersonResponse personResponse, Persons savedPerson) {
//        personResponse.setId(savedPerson.getId());
        personResponse.setFirstName(savedPerson.getFirstName());
        personResponse.setLastName(savedPerson.getLastName());
        personResponse.setEmailAddress(savedPerson.getEmailAddress());
        personResponse.setMessage("successfully created person!!...");
    }
    public static void mapUpdatePerson(UpdatePersonRequest personRequest, Persons foundPerson, Address address) {
        foundPerson.setFirstName(personRequest.getFirstName());
        foundPerson.setLastName(personRequest.getLastName());
        foundPerson.setGender(personRequest.getGender());
        address.setCountry(personRequest.getAddress().getCountry());
        address.setState(personRequest.getAddress().getState());
        address.setCity(personRequest.getAddress().getCity());
        address.setStreetAddress(personRequest.getAddress().getStreetAddress());
    }
    public static void mapUpdatePersonResponse(UpdatePersonResponse updatePersonResponse, Persons savePerson) {
        updatePersonResponse.setFirstName(savePerson.getFirstName());
        updatePersonResponse.setLastName(savePerson.getLastName());
        updatePersonResponse.setGender(savePerson.getGender());
        updatePersonResponse.setAddress(savePerson.getAddress());
//        updatePersonResponse.setAddress(savePerson.getAddress());
    }
}
