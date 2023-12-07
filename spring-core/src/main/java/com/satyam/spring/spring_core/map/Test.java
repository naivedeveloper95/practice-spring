package com.satyam.spring.spring_core.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/satyam/spring/spring_core/map/mapconfig.xml");
		Customer customer = (Customer) context.getBean("customer");

		System.out.println(customer);
		System.out.println(customer.getProducts().getClass());

	}
}
