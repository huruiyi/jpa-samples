package com.in28minutes.spring.basics.springin5steps.service.impl;

import com.in28minutes.spring.basics.springin5steps.service.SortAlgorithm;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BubbleSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
