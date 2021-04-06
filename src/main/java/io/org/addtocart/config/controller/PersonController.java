package io.org.addtocart.config.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.org.addtocart.config.entity.Person;
import io.org.addtocart.config.service.PersonService;
import io.org.addtocart.responseclass.ResponseClass;

@RestController
public class PersonController {

	@Autowired
	private PersonService personservice;

	@GetMapping("/persondetails")
	public List<Person> findAll() {

		return personservice.findAll();
	}

	@GetMapping("/persondetails/{pid}")
	public Person findOneById(@PathVariable int pid) {
		return personservice.getPersonbyId(pid);
	}

	@PostMapping("/persondetails")
	public ResponseClass<Person> createPerson(@RequestBody Person p) {
		Person person = personservice.addPerson(p);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{pid}")
				.buildAndExpand(person.getPersonId()).toUri();

		return new ResponseClass<Person>(HttpStatus.CREATED, person, location.toString());
	}

	@PutMapping("/persondetails")
	public ResponseClass<Person> updateperson(@RequestBody Person person)
	{
		Person p=personservice.updateperson(person);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{pid}")
				.buildAndExpand(person.getPersonId()).toUri();

		return new ResponseClass<Person>(HttpStatus.ACCEPTED, p, location.toString());

	}
}
