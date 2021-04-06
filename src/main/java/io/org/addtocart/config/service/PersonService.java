package io.org.addtocart.config.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.org.addtocart.config.dao.PersonRepository;
import io.org.addtocart.config.entity.Person;
import io.org.addtocart.config.exception.NotfoundException;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Service
public class PersonService {

	@Autowired
	private PersonRepository persondao;

	public PersonService() {

		System.out.println("service person");
	}

	public List<Person> findAll() {

		return persondao.findAll();
	}

	public Person getPersonbyId(int pid) {
		
       Person p=null;
		
		
			
	
		Optional<Person> person = persondao.findById(pid);
		if (!person.isPresent())
			throw new NotfoundException("Person Not Present");
		else
			p=person.get();
		return p;
	}

	public Person findOne(int pid) {
		Person p = null;

		Optional<Person> person = persondao.findById(pid);
		if (!person.isPresent())
			p = person.get();
		return p;
	}

	public Person addPerson(@RequestBody Person person) {
		System.out.println(person.toString());
		return persondao.save(person);

	}
	
	public Person updateperson(Person persn)
	{
		Person p=null;
		Optional<Person> person = persondao.findById(persn.getPersonId());
		if(!person.isPresent())
			p=persondao.save(persn);
		else
			p=persondao.save(persn);
		return p;
			
	}
}
