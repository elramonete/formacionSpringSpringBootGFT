package com.gfttraining.dependencyInjectionExample;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) todas las Bean tienen por defecto el SCOPE_SINGLENTON, referencia a unica instancia, en cambio mediante el  @Scope podemos referenciar a una nueva instancia con SCOPE_PROTOTYPE.
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Sort_B implements  SortAlgorithm{
    @Override
    public void sort(int[] numbers) {
        System.out.println("In sortB");
        //Imagine there is a different sorting algorithm here
        Arrays.sort(numbers);
    }
}
