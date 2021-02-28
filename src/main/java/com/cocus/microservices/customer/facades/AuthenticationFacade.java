package com.cocus.microservices.customer.facades;

import org.keycloak.KeycloakPrincipal;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import static java.util.Objects.isNull;

/**
 * @author Haytham DAHRI
 */
@Component
public class AuthenticationFacade implements IAuthenticationFacade {

    @Override
    public Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    @Override
    public String extractUsernameFromAuthentication() {
        Authentication authentication = this.getAuthentication();
        if( authentication.getPrincipal() instanceof KeycloakPrincipal ) {
            return ((KeycloakPrincipal)authentication.getPrincipal()).getKeycloakSecurityContext().getToken().getPreferredUsername();
        }
        return authentication.getName();
    }

}
