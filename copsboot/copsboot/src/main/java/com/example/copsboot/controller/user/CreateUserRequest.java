package com.example.copsboot.controller.user;


import java.util.UUID;

import org.springframework.security.oauth2.jwt.Jwt;

import com.example.copsboot.model.user.AuthServerId;
import com.example.copsboot.model.user.CreateUserParameters;

import jakarta.validation.constraints.NotEmpty;

public record CreateUserRequest(@NotEmpty String mobileToken) {
    public CreateUserParameters toParameters(Jwt jwt) {
        AuthServerId authServerId = new AuthServerId(UUID.fromString(jwt.getSubject()));

        String email = jwt.getClaimAsString("email"); 
        return new CreateUserParameters(authServerId, email, mobileToken);
}
}
