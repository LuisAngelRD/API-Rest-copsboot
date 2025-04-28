package com.example.copsboot.user;

import java.util.UUID;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class AuthServerIdAttributeConverter implements AttributeConverter<AuthServerId, UUID> {
    @Override
    public UUID convertToDatabaseColumn(AuthServerId attribute) {
        return attribute.value();
    }

    @Override
    public AuthServerId convertToEntityAttribute(UUID dbData) {
        return new AuthServerId(dbData);
    }
}