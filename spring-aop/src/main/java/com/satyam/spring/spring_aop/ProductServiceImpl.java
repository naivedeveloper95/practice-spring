package com.satyam.spring.spring_aop;

public class ProductServiceImpl implements ProductService {

	@Override
	public int multiple(int num1, int num2) {
		return num1 * num2;
	}

}
