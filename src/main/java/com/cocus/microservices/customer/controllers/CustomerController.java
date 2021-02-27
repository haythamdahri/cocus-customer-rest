package com.cocus.microservices.customer.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
public class CustomerController {

    @GetMapping(path = "/")
    public ResponseEntity<Map<String, String>> getCustomers(@RequestHeader HttpHeaders httpHeaders) throws JsonProcessingException {
        System.out.println(new ObjectMapper().writeValueAsString(httpHeaders));
        return ResponseEntity.ok(Map.of("name", "Haytham DAHRI"));
    }

}
