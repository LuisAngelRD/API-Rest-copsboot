package com.example.copsboot.user;

import java.util.UUID;

import com.example.orm.jpa.AbstractEntityId;

public class UserId extends AbstractEntityId<UUID> {

    protected UserId() { //<1>

    }

    public UserId(UUID id) { //<2>
        super(id);
    }
}