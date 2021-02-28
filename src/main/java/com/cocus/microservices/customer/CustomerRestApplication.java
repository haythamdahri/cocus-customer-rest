package com.cocus.microservices.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.cocus.microservices.customer", "com.cocus.microservices.bo"})
@EnableJpaRepositories(value = "com.cocus.microservices.customer.repositories")
public class CustomerRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRestApplication.class, args);
	}

}
