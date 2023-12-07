package com.satyam.spring.spring_core.lc.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/satyam/spring/spring_core/lc/xmlconfig/config.xml");
		Patient patient = (Patient) context.getBean("patient");

		System.out.println(patient);
		context.registerShutdownHook();

	}
}
