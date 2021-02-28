package com.cocus.microservices.customer.controllers;

import com.cocus.microservices.customer.facades.IAuthenticationFacade;
import com.cocus.microservices.customer.services.CustomerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.keycloak.KeycloakPrincipal;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Haytham DAHRI
 */
@RestController
@RequestMapping(path = "/api/v1/customers")
@Log4j2
public class CustomerController {

    private final IAuthenticationFacade authenticationFacade;
    private final CustomerService customerService;

    public CustomerController(IAuthenticationFacade authenticationFacade, CustomerService customerService) {
        this.authenticationFacade = authenticationFacade;
        this.customerService = customerService;
    }

    @GetMapping(path = "/")
    public ResponseEntity<Map<String, Object>> getCustomers(@RequestHeader HttpHeaders httpHeaders) {
        return ResponseEntity.ok(Map.of("name", this.authenticationFacade.extractUsernameFromAuthentication(),
                "user", this.customerService.getCustomerByUsername(this.authenticationFacade.extractUsernameFromAuthentication())));
    }

}
