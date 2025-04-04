package com.evo.security;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Slf4j
@EnableWebSecurity
//@EnableFeignClients(basePackages = {"com.evo.client"})
@EnableMethodSecurity(securedEnabled = true)
@RequiredArgsConstructor
public class HttpSecurityConfiguration {
}
