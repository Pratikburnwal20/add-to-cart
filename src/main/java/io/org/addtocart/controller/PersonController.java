package io.org.addtocart.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import io.org.addtocart.entity.Person;
import io.org.addtocart.restcontroller.PersonRestController;
import io.org.addtocart.service.PersonService;

@Controller
public class PersonController implements PersonRestController{

	@Autowired
	private PersonService  personservice;
	@Override
	public List<Person> findAll() {
		
		return personservice.findAll();
	}

}
