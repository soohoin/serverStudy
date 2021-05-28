package com.example.study.model;

// @Document(collection="user")
public class User {

    private String name;

    @Override
    public String toString() {
        return "name is " + name;
    }
    
}
