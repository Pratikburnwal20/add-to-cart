package io.org.addtocart.config.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import io.org.addtocart.config.dao.PersonRepository;
import io.org.addtocart.config.entity.Person;

@Service
public class PersonService {

	@Autowired
	private PersonRepository persondao;

	public PersonService() {

		System.out.println("service person");
	}

	public List<Person> findAll() {
		// TODO Auto-generated method stub
		ArrayList<Person> al = new ArrayList<>();
		al.add(new Person(1, "ABC", "abc@email.com", 1234567, new Date()));
		al.add(new Person(2, "DCD", "abc@email.com", 1234567, new Date()));
		al.add(new Person(3, "and", "abc@email.com", 1234567, new Date()));
		return al;
	}

//	public Person getPerson(int pid) {
//		Optional<Person> person = persondao.findById(pid);
//		if (!person.isPresent())
//			throw new NotfoundException("Person Not Present");
//		return person.get();
//	}

}
