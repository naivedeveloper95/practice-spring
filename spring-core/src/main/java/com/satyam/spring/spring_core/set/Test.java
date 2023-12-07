package com.satyam.spring.spring_core.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/satyam/spring/spring_core/set/setconfig.xml");
		CarDealer cardealer = (CarDealer) context.getBean("cardealer");

		System.out.println(cardealer.getName());
		System.out.println(cardealer.getModels());
		System.out.println(cardealer.getModels().getClass());

	}
}
