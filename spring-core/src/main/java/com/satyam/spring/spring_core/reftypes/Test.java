package com.satyam.spring.spring_core.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/satyam/spring/spring_core/reftypes/config.xml");
		Students student = (Students) context.getBean("students");

		System.out.println(student.getScores());

	}
}
