package com.satyam.spring.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Employee emp = (Employee) context.getBean("emp");
		System.out.println("Employee Id : " + emp.getId());
		System.out.println("Employee Name " + emp.getName());
	}

}
