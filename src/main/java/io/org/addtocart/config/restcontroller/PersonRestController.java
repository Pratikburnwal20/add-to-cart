package io.org.addtocart.config.restcontroller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.org.addtocart.config.entity.Person;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


public interface PersonRestController {

	@GetMapping("/persondetails")
	public List<Person> findAll();
	
	@PostMapping("/personcreate")
	public Person createPerson(@RequestBody Person person,HttpServletRequest re);

}
