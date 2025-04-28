package com.example.copsboot.repository.user;

import com.example.copsboot.jpa.UserId;

public interface UserRepositoryCustom {
    UserId nextId();
}