package com.daniel.service;

import java.util.List;

import com.daniel.model.Person;

public interface PersonService {
	
	void savePerson(Person persona);
	
	void deletePersonById(String cedula);
	
	void updatePerson(Person person);
	
	List<Person> findAllPersons();
	
	Person findById(String cedula);	
	
}
