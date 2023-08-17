package com.example;

import com.example.entity.Person;
import com.example.jpa.PersonJpaRepository;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = JpaDemoApplication.class)
public class PersonJpaTest {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  PersonJpaRepository repository;


  @Test
  void jpaTest(){
    logger.info("User id 10001 -> {}", repository.findById(10001));

    logger.info("Inserting -> {}", repository.insert(new Person("Tara", "Berlin", new Date())));

    logger.info("Update 10003 -> {}", repository.update(new Person(10003, "Pieter", "Utrecht", new Date())));

    repository.deleteById(10002);

    logger.info("All users -> {}", repository.findAll());
  }

}
