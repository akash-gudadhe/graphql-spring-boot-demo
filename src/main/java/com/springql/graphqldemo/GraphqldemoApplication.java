package com.springql.graphqldemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqldemoApplication {

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(GraphqldemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(){
		return args->{
			Person p1 = new Person();
			p1.setName("akash");
			p1.setCountry("India");
			personRepository.save(p1);
		};
	}

}
