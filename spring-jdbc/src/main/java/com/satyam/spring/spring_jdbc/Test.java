package com.satyam.spring.spring_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/satyam/spring/spring_jdbc/config.xml");
		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "Insert into employee values(?, ?, ?)";
		int result = template.update(sql, new Integer(1), "Satyam", "Suman");
		System.out.println("Number of records inserted are: " + result);
	}

}
