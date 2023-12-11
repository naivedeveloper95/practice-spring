package com.satyam.spring.spring_jdbc.passenger.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.satyam.spring.spring_jdbc.passenger.dao.PassengerDAO;
import com.satyam.spring.spring_jdbc.passenger.dao.rowmapper.PassengerRowMapper;
import com.satyam.spring.spring_jdbc.passenger.dto.Passenger;

public class PassengerDAOImpl implements PassengerDAO {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int createPassenger(Passenger passenger) {
		String sql = "Insert into passenger values(?, ?, ?)";
		int result = jdbcTemplate.update(sql, passenger.getId(), passenger.getFirstName(), passenger.getLastName());
		return result;
	}

	@Override
	public int updatePassenger(Passenger passenger) {
		String sql = "Update passenger set firstName=?, lastName=? where id=?";
		int result = jdbcTemplate.update(sql, passenger.getFirstName(), passenger.getLastName(), passenger.getId());
		return result;
	}

	@Override
	public int deletePassenger(int id) {
		String sql = "DELETE FROM passenger WHERE id=?";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}

	@Override
	public Passenger getPassenger(int id) {

		String sql = "Select * from passenger where id = ?";
		PassengerRowMapper rowMapper = new PassengerRowMapper();
		Passenger passenger = jdbcTemplate.queryForObject(sql, rowMapper, id);

		return passenger;
	}

	@Override
	public List<Passenger> getAllPassenger() {

		String sql = "Select * from passenger";
		PassengerRowMapper rowMapper = new PassengerRowMapper();
		List<Passenger> passenger = jdbcTemplate.query(sql, rowMapper);

		return passenger;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
