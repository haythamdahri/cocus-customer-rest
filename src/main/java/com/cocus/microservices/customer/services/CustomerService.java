package com.cocus.microservices.customer.services;

import com.cocus.microservices.customer.dto.CustomerDTO;

/**
 * @author Haytham DAHRI
 */
public interface CustomerService {

    CustomerDTO getCustomerByUsername(String username);

}
