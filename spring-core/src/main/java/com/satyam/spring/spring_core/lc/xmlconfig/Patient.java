package com.satyam.spring.spring_core.lc.xmlconfig;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter method");
		this.id = id;
	}

	private void init() {
		System.out.println("Inside init method");
	}

	private void destroy() {
		System.out.println("Inside destroy method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
