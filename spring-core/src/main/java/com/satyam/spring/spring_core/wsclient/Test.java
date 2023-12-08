package com.satyam.spring.spring_core.wsclient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/satyam/spring/spring_core/wsclient/config.xml");
		WSClient wsClient = (WSClient) context.getBean("wsclient");
		System.out.println(wsClient);
	}
}
