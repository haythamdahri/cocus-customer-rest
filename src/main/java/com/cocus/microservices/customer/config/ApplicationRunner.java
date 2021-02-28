package com.cocus.microservices.customer.config;

import com.cocus.microservices.bo.entities.CustomerBO;
import com.cocus.microservices.customer.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

/**
 * @author Haytham DAHRI
 */
@Configuration
public class ApplicationRunner implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public ApplicationRunner(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * Populate Testing DATA if environment is not production
     * @param args Input Arguments
     */
    @Override
    public void run(String... args) {
        if( this.customerRepository.count() == 0 ) {
            // haytham user
            CustomerBO haytham = new CustomerBO("Haytham", "Dahri", "haytham", null);
            this.customerRepository.save(haytham);
        }
    }
}
