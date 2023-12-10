package com.satyam.spring.springcore_advanced.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOImpl implements OrderBO {

	@Autowired
	@Qualifier("dao")
	private OrderDAO orderDAO;

	@Override
	public void placeOrder() {
		System.out.println("Inside OrderBO");
		orderDAO.createOrder();
	}

	public OrderDAO getOrderDAO() {
		return orderDAO;
	}

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

}
