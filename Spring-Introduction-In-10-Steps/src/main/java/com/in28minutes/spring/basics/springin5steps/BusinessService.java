package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService {

    @Autowired
    private DataService dataService;

    public BusinessService(DataService dataService) {
        System.out.println("Constructor Injection");
        this.dataService = dataService;
    }

    public long calculateSum() {
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }
}
