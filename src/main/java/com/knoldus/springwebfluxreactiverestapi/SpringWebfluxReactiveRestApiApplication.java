package com.knoldus.springwebfluxreactiverestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class SpringWebfluxReactiveRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebfluxReactiveRestApiApplication.class, args);
	}

}
