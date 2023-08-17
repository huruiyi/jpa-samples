package com.example;


import com.example.entity.Person;
import com.example.jdbc.PersonJbdcDao;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = JpaDemoApplication.class)
class JbdcTest {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  PersonJbdcDao dao;


  @Test
  void jdbcTest(){

    logger.info("All users -> {}", dao.findAll());

    logger.info("User id 10001 -> {}", dao.findById(10001));

    logger.info("Deleting 10002 -> No of Rows Deleted - {}", dao.deleteById(10002));

    logger.info("Inserting 10004 -> {}", dao.insert(new Person(10004, "Tara", "Berlin", new Date())));

    logger.info("Update 10003 -> {}", dao.update(new Person(10003, "Pieter", "Utrecht", new Date())));
  }

}
