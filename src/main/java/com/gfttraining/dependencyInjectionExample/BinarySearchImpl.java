package com.gfttraining.dependencyInjectionExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class BinarySearchImpl {

    //@Qualifier("sort_A")
    //Primary:Queremos que se ejecute ese Bean, si tenemos el Qualifier como vemos en la clase BinarySearchImp  @Qualifier("sortD") SortAlgorithm sortAlgorithm; el Primary pasa a segundo plano
    //todos los Bean o clases A,B,C,D recurren a la interfaz sortAlgorithm
    @Autowired
    @Qualifier("sortD")
    SortAlgorithm sortAlgorithm;
    //@Autowired: También podemos referenciar una dependencia mediante el uso de los atributos utilizando la annotation @Autowired ver https://gustavopeiretti.com/spring-boot-componentes-estereotipos/

/*
    public BinarySearchImpl (SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
*/

    public int search(int[] numbers, int numberToSearchFor) {

        //sort
       // Arrays.sort(numbers);
        sortAlgorithm.sort(numbers);

        return  Arrays.binarySearch(numbers, numberToSearchFor);
    }
}
