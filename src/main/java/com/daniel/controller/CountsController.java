package com.daniel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.model.Count;
import com.daniel.model.Person;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin
@RestController
@RequestMapping("api/v1")
@Tag(name = "Service Counts Controller")
public class CountsController {

	// Get
	@Operation(summary = "Get all counts", description = "retrieve all counts")
	@GetMapping("/counts")
	public ResponseEntity<List<Count>> getPersons() {
		List<Count> counts = new ArrayList<>();
		if (counts.isEmpty()) {
			return new ResponseEntity<List<Count>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Count>>(counts, HttpStatus.OK);
	}

	// Get
	@Operation(summary = "Get person by id (cedula)", description = "find person by id")
	@GetMapping("/counts/{id}")
	public ResponseEntity<Person> getPersonById(@PathVariable("id") String id) {
		Person person = new Person();
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}

	// Post
	@Operation(summary = "Create person", description = "create person")
	@PostMapping("/counts")
	public ResponseEntity<Person> postCreatePerson(Person person) {
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}

	// Put
	@Operation(summary = "Update person", description = "update person")
	@PutMapping("/counts")
	public ResponseEntity<Person> updatePerson(Person person) {
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}

	// delete
	@Operation(summary = "Remove person", description = "remove person")
	@DeleteMapping("/counts/{id}")
	public ResponseEntity<?> deletePerson(@PathVariable("id") String id) {
		return new ResponseEntity(HttpStatus.OK);
	}

}
