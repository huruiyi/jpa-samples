package com.example;

import com.example.entity.Person;
import com.example.jdbc.PersonJbdcDao;
import com.example.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJbdcDao dao;


    @Autowired
    PersonJpaRepository repository;


    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        test1();
    }

    private void test1() {
        logger.info("All users -> {}", dao.findAll());

        logger.info("User id 10001 -> {}", dao.findById(10001));

        logger.info("Deleting 10002 -> No of Rows Deleted - {}", dao.deleteById(10003));

        logger.info("Inserting 10004 -> {}", dao.insert(new Person(10004, "Tara", "Berlin", new Date())));

        logger.info("Update 10003 -> {}", dao.update(new Person(10004, "Pieter", "Utrecht", new Date())));
    }

    private void test2() {
        logger.info("User id 10001 -> {}", repository.findById(10001));

        logger.info("Inserting -> {}", repository.insert(new Person("Tara", "Berlin", new Date())));

        logger.info("Update 10003 -> {}", repository.update(new Person(10003, "Pieter", "Utrecht", new Date())));

        repository.deleteById(10002);

        logger.info("All users -> {}", repository.findAll());
    }
}
