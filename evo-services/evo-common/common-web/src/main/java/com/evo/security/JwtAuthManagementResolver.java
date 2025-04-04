package com.evo.security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationManagerResolver;
import org.springframework.security.oauth2.server.resource.web.BearerTokenResolver;
import org.springframework.security.oauth2.server.resource.web.DefaultBearerTokenResolver;

import java.util.HashMap;
import java.util.Map;

public class JwtAuthManagementResolver implements AuthenticationManagerResolver<HttpServletRequest> {
    private final Map<String, String> issuers;
    private final Map<String, AuthenticationManager> authenticationManager = new HashMap<>();
    private final BearerTokenResolver resolver = new DefaultBearerTokenResolver();

    public JwtAuthManagementResolver(Map<String, String> issuers) {
        this.issuers = issuers;
    }

    @Override
    public AuthenticationManager resolve(HttpServletRequest context) {
        return null;
    }
}
