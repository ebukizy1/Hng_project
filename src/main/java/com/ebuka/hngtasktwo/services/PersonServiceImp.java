package com.ebuka.hngtasktwo.services;


import com.ebuka.hngtasktwo.data.models.Address;
import com.ebuka.hngtasktwo.data.models.Persons;
import com.ebuka.hngtasktwo.data.repository.PersonRepository;
import com.ebuka.hngtasktwo.dto.request.CreatePersonRequest;
import com.ebuka.hngtasktwo.dto.request.UpdatePersonRequest;
import com.ebuka.hngtasktwo.dto.response.CreatePersonResponse;
import com.ebuka.hngtasktwo.dto.response.FetchPersonResponse;
import com.ebuka.hngtasktwo.dto.response.UpdatePersonResponse;
import com.ebuka.hngtasktwo.exception.PersonAlreadyExistException;
import com.ebuka.hngtasktwo.exception.PersonNotExistException;
import com.ebuka.hngtasktwo.utils.Mapper;
import com.ebuka.hngtasktwo.utils.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImp implements PersonServices {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public CreatePersonResponse createPerson(CreatePersonRequest createPersonRequest) {
        Persons persons = new Persons();
        Address address = new Address();
        Validator.validateCreatePerson(createPersonRequest);
        validatePersonAlreadyExist(createPersonRequest.getEmailAddress().toLowerCase());
        Validator.validateEmail(createPersonRequest.getEmailAddress().toLowerCase());
       Mapper.mapCreatePersonRequest(createPersonRequest, address, persons);
        var savedPerson = personRepository.save(persons);
        CreatePersonResponse personResponse = new CreatePersonResponse();
        Mapper.mapCreatePersonResponse(personResponse, savedPerson);

        return personResponse;
    }
    
    @Override
    public FetchPersonResponse fetchPerson(String personId) {
        Persons foundPerson = validatePersonWithEmail(personId);
        FetchPersonResponse fetchPersonResponse = new FetchPersonResponse();
        Mapper.mapFetchPersonResponse(fetchPersonResponse, foundPerson);
        return fetchPersonResponse;
    }
    

    @Override
    public UpdatePersonResponse updatePerson(String personId, UpdatePersonRequest personRequest) {
        Persons foundPerson = validatePersonWithEmail(personId);
        UpdatePersonResponse updatePersonResponse = new UpdatePersonResponse();
        Address address = new Address();
        Mapper.mapUpdatePerson(personRequest, foundPerson, address);
        foundPerson.setAddress(address);
        Persons savePerson = personRepository.save(foundPerson);
        Mapper.mapUpdatePersonResponse(updatePersonResponse, savePerson);
        return updatePersonResponse;

    }

    @Override
    public String deletePerson(String personId) {
        String message = "";
        Persons foundPerson = validatePersonWithEmail(personId);
        personRepository.delete(foundPerson);
        message = foundPerson.getEmailAddress() + " successfully deleted";
        return message;


    }

    public Persons validatePersonWithEmail(String email) {
        Optional<Persons> optionalPersons = personRepository.findByEmailAddress(email);
        if (optionalPersons.isEmpty()) throw new PersonNotExistException(email + "  does not exist");
        return optionalPersons.get();
    }

    public void validatePersonAlreadyExist(String email) {
        Optional<Persons> optionalPersons = personRepository.findByEmailAddress(email);
        if (optionalPersons.isPresent()) {
            throw new PersonAlreadyExistException(email + " emailAddress Already exist");
        }
    }

    
    }
