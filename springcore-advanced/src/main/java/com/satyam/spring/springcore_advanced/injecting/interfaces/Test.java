package com.satyam.spring.springcore_advanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/satyam/spring/springcore_advanced/injecting/interfaces/config-annotation.xml");
		OrderBO orderBo = (OrderBO) context.getBean("bo");
		orderBo.placeOrder();
	}
}
