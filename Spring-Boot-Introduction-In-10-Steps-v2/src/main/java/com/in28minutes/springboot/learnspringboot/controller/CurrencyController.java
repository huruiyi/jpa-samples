package com.in28minutes.springboot.learnspringboot.controller;

import com.in28minutes.springboot.learnspringboot.config.CurrencyServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

    /**
     * http://localhost:8080/currency-configuration
     */
    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllCourses() {
        return configuration;
    }

}
