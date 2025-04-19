package com.example.copsboot.user;

import org.springframework.data.repository.CrudRepository;
//tag::class[]
public interface UserRepository extends CrudRepository<User, UserId>, UserRepositoryCustom {
}
//end::class[]