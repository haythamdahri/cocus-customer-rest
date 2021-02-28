package com.cocus.microservices.customer.services.impl;

import com.cocus.microservices.bo.entities.CustomerBO;
import com.cocus.microservices.customer.exceptions.exceptions.NotFoundException;
import com.cocus.microservices.customer.repositories.CustomerRepository;
import com.cocus.microservices.customer.services.CustomerService;
import org.springframework.stereotype.Service;

/**
 * @author Haytham DAHRI
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    public final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerBO getCustomerByUsername(String username) {
        return this.customerRepository.findByUsername(username).orElseThrow(() -> new NotFoundException("No Customer Found!"));
    }
}
