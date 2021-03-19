package io.org.addtocart.config.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import io.org.addtocart.config.entity.Person;
import io.org.addtocart.config.restcontroller.PersonRestController;
import io.org.addtocart.config.service.PersonService;

@Controller
public class PersonController implements PersonRestController {

	@Autowired
	private PersonService personservice;

	@Override
	public List<Person> findAll() {

		return personservice.findAll();
	}	

	}
