package com.daniel.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.daniel.entity.Person;

@Repository
@Transactional
public class PersonDaoImpl extends AbsctractSession implements PersonDao {

	@Override
	public void savePerson(Person persona) {
		// TODO Auto-generated method stub
		
		getSessionFactory().persist(persona);
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
