package com.satyam.spring.springcore_advanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAO create order");
	}

}
