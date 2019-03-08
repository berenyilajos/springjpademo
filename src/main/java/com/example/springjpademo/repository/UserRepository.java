package com.example.springjpademo.repository;

import com.example.springjpademo.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> getUserByName(String name);
    User findOneById(long id);
}
