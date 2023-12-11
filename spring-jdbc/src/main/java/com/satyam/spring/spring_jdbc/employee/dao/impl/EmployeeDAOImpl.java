package com.satyam.spring.spring_jdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.satyam.spring.spring_jdbc.employee.dao.EmployeeDAO;
import com.satyam.spring.spring_jdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.satyam.spring.spring_jdbc.employee.dto.Employee;

@Component("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "Insert into employee values(?, ?, ?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql = "Update employee set firstName=?, lastName=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "DELETE FROM employee WHERE id=?";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql = "Select * from employee where id=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, id);

		return employee;
	}

	@Override
	public List<Employee> readAll() {
		String sql = "Select * from employee";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> employee = jdbcTemplate.query(sql, rowMapper);

		return employee;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
