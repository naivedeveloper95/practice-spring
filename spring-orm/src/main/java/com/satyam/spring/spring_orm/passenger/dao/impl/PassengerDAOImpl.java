package com.satyam.spring.spring_orm.passenger.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.satyam.spring.spring_orm.passenger.dao.PassengerDAO;
import com.satyam.spring.spring_orm.passenger.dto.Passenger;

@Component("passengerDao")
public class PassengerDAOImpl implements PassengerDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int createPassenger(Passenger passenger) {
		Integer result = (Integer) hibernateTemplate.save(passenger);
		return result;
	}

	@Override
	@Transactional
	public void updatePassenger(Passenger passenger) {
		hibernateTemplate.update(passenger);
	}

	@Override
	@Transactional
	public void deletePassenger(Passenger passenger) {
		hibernateTemplate.delete(passenger);
	}

	@Override
	public Passenger getPassenger(int id) {
		Passenger passenger = hibernateTemplate.get(Passenger.class, id);
		return passenger;
	}

	@Override
	public List<Passenger> getAllPassenger() {
		List<Passenger> passengerList = hibernateTemplate.loadAll(Passenger.class);
		return passengerList;
	}
}
