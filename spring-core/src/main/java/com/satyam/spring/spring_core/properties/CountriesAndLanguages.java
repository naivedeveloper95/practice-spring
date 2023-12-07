package com.satyam.spring.spring_core.properties;

import java.util.Properties;

public class CountriesAndLanguages {

	private Properties countriesAndLanguages;

	public Properties getCountriesAndLanguages() {
		return countriesAndLanguages;
	}

	public void setCountriesAndLanguages(Properties countriesAndLanguages) {
		this.countriesAndLanguages = countriesAndLanguages;
	}

	@Override
	public String toString() {
		return "CountriesAndLanguages [countriesAndLanguages=" + countriesAndLanguages + "]";
	}
}