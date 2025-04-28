package com.example.copsboot.repository.user;


import java.util.UUID;

import com.example.copsboot.jpa.UniqueIdGenerator;
import com.example.copsboot.jpa.UserId;



public class UserRepositoryImpl implements UserRepositoryCustom {
    private final UniqueIdGenerator<UUID> generator;

    public UserRepositoryImpl(UniqueIdGenerator<UUID> generator) {
        this.generator = generator;
    }

    public UserId nextId() {
        return new UserId(generator.getNextUniqueId());
    }
}
