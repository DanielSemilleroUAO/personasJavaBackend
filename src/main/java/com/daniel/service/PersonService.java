package com.daniel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.daniel.entity.Person;



public interface PersonService {
	
	void savePerson(Person persona);
	
	void deletePersonById(String cedula);
	
	void updatePerson(Person person);
	
	List<Person> findAllPersons();
	
	Person findById(String cedula);	
	
}
