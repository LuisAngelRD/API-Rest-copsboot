package com.example.copsboot.jpa;


public interface Entity<T extends EntityId> {
    T getId();
}