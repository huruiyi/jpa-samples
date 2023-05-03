package com.in28minutes.learnspringframework.enterprise.flow.web;

import com.in28minutes.learnspringframework.enterprise.flow.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebController {

    @Autowired
    private BusinessService businessService;


    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }

    @GetMapping("/sum")
    public long displaySum() {
        return businessService.calculateSum();
    }

}