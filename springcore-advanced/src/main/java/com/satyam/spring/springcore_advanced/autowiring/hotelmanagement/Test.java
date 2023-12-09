package com.satyam.spring.springcore_advanced.autowiring.hotelmanagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/satyam/spring/springcore_advanced/autowiring/hotelmanagement/config.xml");

		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
	}
}
