package com.in28minutes.spring.basics.springin5steps.service.impl;

import com.in28minutes.spring.basics.springin5steps.service.SortAlgorithm;
import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
