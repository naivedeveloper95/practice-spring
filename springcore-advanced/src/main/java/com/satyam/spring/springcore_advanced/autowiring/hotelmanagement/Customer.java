package com.satyam.spring.springcore_advanced.autowiring.hotelmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {

	@Autowired(required = false)
	@Qualifier("reservation2")
	private Reservation reservation;

//	@Autowired
//	public Employee(Address address) {
//		this.address = address;
//	}

	public Reservation getReservation() {
		return reservation;
	}

//	@Autowired
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	@Override
	public String toString() {
		return "Customer [reservation=" + reservation + "]";
	}

}
