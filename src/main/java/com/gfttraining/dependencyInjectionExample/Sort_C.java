package com.gfttraining.dependencyInjectionExample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;


public class Sort_C implements  SortAlgorithm{
    @Override
    public void sort(int[] numbers) {
        System.out.println("In sortC");
        Arrays.sort(numbers);
    }
}
