package com.satyam.spring.spring_core.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/satyam/spring/spring_core/propertyplaceholder/config.xml");
		MyDao dao = (MyDao) context.getBean("myDao");
		System.out.println(dao);
	}
}
