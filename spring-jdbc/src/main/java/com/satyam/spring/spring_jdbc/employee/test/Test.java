package com.satyam.spring.spring_jdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.satyam.spring.spring_jdbc.employee.dao.EmployeeDAO;
import com.satyam.spring.spring_jdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/satyam/spring/spring_jdbc/employee/test/config.xml");

		EmployeeDAO edao = (EmployeeDAO) context.getBean("employeeDao");
//		Employee employee = new Employee();
//		employee.setId(2);
//		employee.setFirstName("Aditya");
//		employee.setLastName("Vishesh");

//		int result = edao.create(employee);
//		int result = edao.update(employee);
//		int result = edao.delete(2);
//		Employee result = edao.read(1);
		List<Employee> listOfEmp = edao.readAll();
		System.out.println("The number of rows affected are " + listOfEmp);
	}
}
