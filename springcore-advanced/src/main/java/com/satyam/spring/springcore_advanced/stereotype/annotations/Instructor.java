package com.satyam.spring.springcore_advanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {

	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int id = 10;
	@Value("#{new java.lang.String('Satyam Suman').toUpperCase()}")
	private String name = "Suman";
	@Value("#{topics}")
	private List<String> topics;
	@Autowired
	private Profile profile;

	@Value("#{2+4 > 8 ? true : false}")
	private boolean active;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + ", active="
				+ active + "]";
	}

}
