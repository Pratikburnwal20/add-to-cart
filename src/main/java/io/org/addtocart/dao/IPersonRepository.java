package io.org.addtocart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import io.org.addtocart.entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {

}
