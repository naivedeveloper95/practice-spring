package com.satyam.spring.spring_aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.satyam.spring.spring_aop.ProductService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/satyam/spring/spring_aop/test/config.xml");
		ProductService productService = (ProductService) context.getBean("productService");
		int multiple = productService.multiple(4, 10);
		System.out.println(multiple);
	}

}
