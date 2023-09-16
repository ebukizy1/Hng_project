package com.ebuka.hngtasktwo.services;

import com.ebuka.hngtasktwo.dto.request.CreatePersonRequest;
import com.ebuka.hngtasktwo.dto.request.UpdatePersonRequest;
import com.ebuka.hngtasktwo.dto.response.CreatePersonResponse;
import com.ebuka.hngtasktwo.dto.response.FetchPersonResponse;
import com.ebuka.hngtasktwo.dto.response.UpdatePersonResponse;

public interface PersonServices {

    CreatePersonResponse createPerson(CreatePersonRequest createPersonRequest);
    FetchPersonResponse fetchPerson(String personId);
    UpdatePersonResponse updatePerson(String personId, UpdatePersonRequest personRequest);
    String deletePerson(String personId);


}
