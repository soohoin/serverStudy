package com.example.study;

import com.example.study.repository.UserMongoDBRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringBootMongoDBTest {
    @Autowired
    private UserMongoDBRepository mongoDBRepository;

    @Test
    public void printMongoDB() {
        System.out.println(mongoDBRepository.findByName("park"));
        System.out.println(mongoDBRepository.findAll());
    }
    
}
