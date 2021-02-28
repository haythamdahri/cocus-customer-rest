package com.cocus.microservices.customer.services;

import com.cocus.microservices.bo.entities.CustomerBO;

/**
 * @author Haytham DAHRI
 */
public interface CustomerService {

    CustomerBO getCustomerByUsername(String username);

}
