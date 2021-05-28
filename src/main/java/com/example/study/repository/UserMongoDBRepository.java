package com.example.study.repository;

import com.example.study.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserMongoDBRepository extends MongoRepository<User, String> {
    public User findByName(String name);
}
