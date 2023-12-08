package com.satyam.spring.spring_core.constructorinjection.ambiguity;

public class Addition {

//	public Addition(double a, double b) {
//		System.out.println("Inside constructor double");
//	}
//
//	public Addition(int a, int b) {
//		System.out.println("Inside constructor int");
//	}
//
//	public Addition(String a, String b) {
//		System.out.println("Inside constructor String");
//	}

	public Addition(int a, double b) {
		System.out.println("Inside the constructor");
		System.out.println(a);
		System.out.println(b);
	}
}
