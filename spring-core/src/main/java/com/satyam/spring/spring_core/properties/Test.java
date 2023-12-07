package com.satyam.spring.spring_core.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/satyam/spring/spring_core/properties/config.xml");
		CountriesAndLanguages countriesAndLangs = (CountriesAndLanguages) context.getBean("countriesAndLangs");

		System.out.println(countriesAndLangs);
		System.out.println(countriesAndLangs.getCountriesAndLanguages().getClass());

	}
}
