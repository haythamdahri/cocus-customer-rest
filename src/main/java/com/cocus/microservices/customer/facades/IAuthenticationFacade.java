package com.cocus.microservices.customer.facades;

import org.springframework.security.core.Authentication;

/**
 * @author Haytham DAHRI
 */
public interface IAuthenticationFacade {

    Authentication getAuthentication();

    String extractUsernameFromAuthentication();

}
