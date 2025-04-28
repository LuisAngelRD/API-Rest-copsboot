package com.example.copsboot.model.user;



import java.util.UUID;

import org.springframework.util.Assert;

public record AuthServerId(UUID value) {
    public AuthServerId{
        Assert.notNull(value, "The AuthServerId value should not be null.");
    } 
   
    public String asString() {
        return value.toString();
    }


}