package com.gfttraining.dependencyInjectionExample;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Configuration: Para marcar que esta clase va inicializar beans
@Configuration
public class JavaConfigurationExample {


    //Bean:En métodos que inicializan bean
    //Primary:Queremos que se ejecute ese Bean, si tenemos el Qualifier como vemos en la clase BinarySearchImp  @Qualifier("sortD") SortAlgorithm sortAlgorithm; el Primary pasa a segundo plano
    @Bean
    @Primary
    public SortAlgorithm sort_C(){
        return new Sort_C();
    }

    @Bean("sortD")
    public SortAlgorithm sort_D(){
        return new Sort_D();
    }
}
