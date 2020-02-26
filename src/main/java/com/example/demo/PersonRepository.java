package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface PersonRepository extends CrudRepository<Person, Long> {

    public ArrayList<Person> findByName(String name); //this will search repository and return an arraylist of Person objects with matching "name"
//    public ArrayList<Person> findByNameContains(String name); //searching "Re" will return "Rey" person

}
