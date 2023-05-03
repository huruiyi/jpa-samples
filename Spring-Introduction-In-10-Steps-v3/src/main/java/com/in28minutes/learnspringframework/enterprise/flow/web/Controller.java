package com.in28minutes.learnspringframework.enterprise.flow.web;

import com.in28minutes.learnspringframework.enterprise.flow.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Sending response in the right format
@RestController
public class Controller {

    @Autowired
    private BusinessService businessService;

    //"/sum" => 100
    @GetMapping("/sum")
    public long displaySum() {
        return businessService.calculateSum();
    }

}
