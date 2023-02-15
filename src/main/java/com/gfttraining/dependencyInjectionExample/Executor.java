package com.gfttraining.dependencyInjectionExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Executor implements CommandLineRunner {

    @Autowired
    BinarySearchImpl binarySearch;

    @Override
    public void run(String args[] ) throws  Exception{
        System.out.println("Runing executor");
        System.out.println(binarySearch.search(new int[] {1,2,3}, 2));
    }

}
