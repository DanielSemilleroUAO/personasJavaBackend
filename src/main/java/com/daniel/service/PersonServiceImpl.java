package com.daniel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.entity.Person;
import com.daniel.repository.PersonDao;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	@Override
	public void savePerson(Person persona) {
		// TODO Auto-generated method stub
		personDao.savePerson(persona);
	}

	@Override
	public void deletePersonById(String cedula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePerson(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Person> findAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person findById(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

}
