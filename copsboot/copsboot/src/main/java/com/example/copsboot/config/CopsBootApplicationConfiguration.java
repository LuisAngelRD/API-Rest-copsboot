package com.example.copsboot.config;

import java.util.UUID;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.copsboot.jpa.InMemoryUniqueIdGenerator;
import com.example.copsboot.jpa.UniqueIdGenerator;

@Configuration
public class CopsBootApplicationConfiguration {
    @Bean
    public UniqueIdGenerator<UUID> uniqueIdGenerator() {
        return new InMemoryUniqueIdGenerator();
    }
}
