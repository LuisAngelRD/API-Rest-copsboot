package com.example.copsboot.repository.user;



import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.copsboot.jpa.UserId;
import com.example.copsboot.model.user.AuthServerId;
import com.example.copsboot.model.user.User;


public interface UserRepository extends CrudRepository<User, UserId>, UserRepositoryCustom{
    Optional<User> findByAuthServerId(AuthServerId authServerId);

    Optional<User> findByMobileToken(String mobileToken);
}