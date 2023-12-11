package com.satyam.spring.spring_jdbc.passenger.dao;

import java.util.List;

import com.satyam.spring.spring_jdbc.passenger.dto.Passenger;

public interface PassengerDAO {
	int createPassenger(Passenger passenger);

	int updatePassenger(Passenger passenger);

	int deletePassenger(int id);

	Passenger getPassenger(int id);

	List<Passenger> getAllPassenger();
}
