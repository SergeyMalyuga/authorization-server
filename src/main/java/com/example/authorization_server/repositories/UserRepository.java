package com.example.authorization_server.repositories;

import com.example.authorization_server.entyties.UserM;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserM, Long> {
    UserM findByUsername(String userName);
}
