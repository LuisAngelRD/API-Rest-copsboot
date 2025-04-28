package com.example.copsboot.jpa;

public interface UniqueIdGenerator<T> {
    T getNextUniqueId();
}