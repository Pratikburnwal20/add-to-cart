package io.org.addtocart.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import io.org.addtocart.entity.Person;

@Service
public class PersonService {

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
}
