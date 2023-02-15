package com.gfttraining.dependencyInjectionExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionExampleApplication {

	//https://gustavopeiretti.com/spring-boot-componentes-estereotipos/
	public static void main(String[] args) {

		ApplicationContext applicationContext =
		SpringApplication.run(DependencyInjectionExampleApplication.class, args);

		System.out.println("");
		System.out.println("*****************************");
		System.out.println("beanName: ");
		for(String beanName: applicationContext.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
		System.out.println("*****************************");

		//BinarySearchImpl binarySearch = new BinarySearchImpl(new Sort_A());
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		SortAlgorithm sort_A1 = applicationContext.getBean(Sort_A.class);
		System.out.println("Sort_A1= " + sort_A1);

		SortAlgorithm sort_A2 = applicationContext.getBean(Sort_A.class);
		System.out.println("Sort_A2= " + sort_A2);


		SortAlgorithm sort_B1 = applicationContext.getBean(Sort_B.class);
		System.out.println("Sort_B1= " + sort_B1);

		SortAlgorithm sort_B2 = applicationContext.getBean(Sort_B.class);
		System.out.println("Sort_B2= " + sort_B2);

		//System.out.println(binarySearch.search(new int[] {1,2,3}, 2));
	}

}
