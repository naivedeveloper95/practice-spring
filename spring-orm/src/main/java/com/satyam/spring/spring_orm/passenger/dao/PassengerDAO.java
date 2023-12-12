package com.satyam.spring.spring_orm.passenger.dao;

import java.util.List;

import com.satyam.spring.spring_orm.passenger.dto.Passenger;

public interface PassengerDAO {
	int createPassenger(Passenger passenger);

	void updatePassenger(Passenger passenger);

	void deletePassenger(Passenger passenger);

	Passenger getPassenger(int id);

	List<Passenger> getAllPassenger();
}
