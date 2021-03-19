package io.org.addtocart.config.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.org.addtocart.config.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
