package io.org.addtocart.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.org.addtocart.entity.Person;

@RestController
public interface PersonRestController {
	
	@GetMapping("/persondetails")
	public List<Person> findAll();
	

}
