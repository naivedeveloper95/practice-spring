package com.satyam.spring.spring_core.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/satyam/spring/spring_core/constructorinjection/ambiguity/config.xml");

		Addition addition = (Addition) context.getBean("addition");
		System.out.println(addition);
	}
}
