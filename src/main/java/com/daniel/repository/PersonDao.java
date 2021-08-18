package com.daniel.repository;

import java.util.List;

import com.daniel.entity.Person;


public interface PersonDao {
	
void savePerson(Person persona);
	
	void deletePersonById(String cedula);
	
	void updatePerson(Person person);
	
	List<Person> findAllPersons();
	
	Person findById(String cedula);	
	
	
}
