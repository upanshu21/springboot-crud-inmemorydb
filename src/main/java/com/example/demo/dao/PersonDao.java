package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    /**
     * This method allows us to enter person with a given id.
     */
    int insertPerson(UUID id, Person person);

    /**
     * This method will generate an id for the person who does not have an id.
     * @param person is the details of the person.
     * @return the function insertPerson() with the generated id.
     */
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);



}
