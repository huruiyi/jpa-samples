package com.example;

import com.example.runner.UserDaoServiceCommandLineRunner;
import com.example.runner.UserRepositoryCommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringBootApplication {

    @Autowired
    UserDaoServiceCommandLineRunner userDaoServiceCommandLineRunner;

    @Autowired
    UserRepositoryCommandLineRunner userRepositoryCommandLineRunner;

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringBootApplication.class, args);
    }

}
