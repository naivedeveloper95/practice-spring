package com.satyam.spring.spring_core.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/satyam/spring/spring_core/list/listconfig.xml");
		Hospital hospital = (Hospital) context.getBean("hospital");

		System.out.println(hospital.getName());
		System.out.println(hospital.getDepartments());
		System.out.println(hospital.getDepartments().getClass());

	}
}
