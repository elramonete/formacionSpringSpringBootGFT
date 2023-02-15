package com.gfttraining.dependencyInjectionExample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class Sort_A implements  SortAlgorithm{
    @Override
    public void sort(int[] numbers) {
        System.out.println("In sortA");
        Arrays.sort(numbers);
    }
}
