package com.example.copsboot.service.user;

import org.springframework.stereotype.Service;

import com.example.copsboot.jpa.UserId;
import com.example.copsboot.model.user.AuthServerId;
import com.example.copsboot.model.user.CreateUserParameters;
import com.example.copsboot.model.user.User;
import com.example.copsboot.repository.user.UserRepository;

import java.util.Optional;
@Service
public class UserService {
    private final UserRepository repository; 
    
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public Optional<User> findUserByAuthServerId(AuthServerId authServerId) { 
        return repository.findByAuthServerId(authServerId);
    }

    public User createUser(CreateUserParameters createUserParameters) {
        UserId userId = repository.nextId();
        User user = new User(userId, createUserParameters.email(),createUserParameters.authServerId(),createUserParameters.mobileToken());
        return repository.save(user);
    }

    public Optional<User> getUserById(UserId userId) {
        return repository.findById(userId);
    }
    
    public Optional<User> findUserByMobileToken(String mobileToken) {
        return repository.findByMobileToken(mobileToken);
    }
}