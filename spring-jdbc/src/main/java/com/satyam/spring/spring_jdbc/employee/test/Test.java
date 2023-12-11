package com.satyam.spring.spring_jdbc.employee.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.satyam.spring.spring_jdbc.passenger.dao.PassengerDAO;
import com.satyam.spring.spring_jdbc.passenger.dto.Passenger;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/satyam/spring/spring_jdbc/employee/test/config.xml");

//		EmployeeDAO edao = (EmployeeDAO) context.getBean("employeeDao");
//		Employee employee = new Employee();
//		employee.setId(2);
//		employee.setFirstName("Aditya");
//		employee.setLastName("Vishesh");

//		int result = edao.create(employee);
//		int result = edao.update(employee);
//		int result = edao.delete(2);
//		Employee result = edao.read(1);
//		List<Employee> listOfEmp = edao.readAll();
//		System.out.println("The number of rows affected are " + listOfEmp);

		PassengerDAO pdao = (PassengerDAO) context.getBean("passengerDao");
//		Passenger passenger = new Passenger();

//		passenger.setId(2);
//		passenger.setFirstName("Aadtiya");
//		passenger.setLastName("Vishesh");

//		int result = pdao.createPassenger(passenger);
//		int result = pdao.updatePassenger(passenger);
//		int result = pdao.deletePassenger(2);
//		Passenger passenger = pdao.getPassenger(1);
		List<Passenger> listOfPass = pdao.getAllPassenger();
		for (Iterator iterator = listOfPass.iterator(); iterator.hasNext();) {
			Passenger passenger = (Passenger) iterator.next();
			System.out.println(passenger);
		}
//		System.out.println("The number of rows affected are " + listOfPass);
	}
}
