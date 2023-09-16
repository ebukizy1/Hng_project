package com.ebuka.hngtasktwo.data.repository;

import com.ebuka.hngtasktwo.data.models.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Persons, Long> {
    Optional<Persons> findByEmailAddress(String emailAddress);
}