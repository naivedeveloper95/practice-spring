package com.satyam.spring.springcore_advanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/satyam/spring/springcore_advanced/standalone/collections/config.xml");

		ProductsList productsList = (ProductsList) context.getBean("productslist");
		System.out.println(productsList);
	}
}
