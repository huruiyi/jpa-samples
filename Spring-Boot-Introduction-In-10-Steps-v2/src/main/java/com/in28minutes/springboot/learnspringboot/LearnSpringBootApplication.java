package com.in28minutes.springboot.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSpringBootApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(LearnSpringBootApplication.class, args);

        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }

}
