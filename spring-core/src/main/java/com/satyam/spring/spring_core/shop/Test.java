package com.satyam.spring.spring_core.shop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/satyam/spring/spring_core/shop/config.xml");
		ShoppingCart cart = (ShoppingCart) context.getBean("shoppingCart");

		System.out.println(cart.getCart());
		System.out.println(cart);

	}
}
