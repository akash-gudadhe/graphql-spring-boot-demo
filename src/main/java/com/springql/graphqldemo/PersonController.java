package com.springql.graphqldemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
	private PersonRepository personRepository;
    @QueryMapping
    public List<Person> persons(){
        return personRepository.findAll();
    }
}
