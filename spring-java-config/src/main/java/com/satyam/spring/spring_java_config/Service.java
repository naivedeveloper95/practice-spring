package com.satyam.spring.spring_java_config;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {

	@Autowired
	Dao dao;

	private void init() {
		System.out.println("init");
	}

	public void save() {
		dao.create();
	}

	public void destroy() {
		System.out.println("destroy");
	}
}
