package com.satyam.spring.spring_jdbc.employee.dao;

import java.util.List;

import com.satyam.spring.spring_jdbc.employee.dto.Employee;

public interface EmployeeDAO {

	int create(Employee employee);
	int update(Employee employee);
	int delete(int id);
	Employee read(int id);
	List<Employee> readAll();
}
