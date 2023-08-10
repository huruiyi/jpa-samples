package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.service.SortAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortedNumbers);
        return 3;
    }

}
