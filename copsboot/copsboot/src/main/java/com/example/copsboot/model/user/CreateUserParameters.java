package com.example.copsboot.model.user;


public record CreateUserParameters(AuthServerId authServerId, String email, String mobileToken) {
}