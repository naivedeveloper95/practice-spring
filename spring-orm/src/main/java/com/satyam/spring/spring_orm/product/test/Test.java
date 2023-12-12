package com.satyam.spring.spring_orm.product.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.satyam.spring.spring_orm.passenger.dao.PassengerDAO;
import com.satyam.spring.spring_orm.passenger.dto.Passenger;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/satyam/spring/spring_orm/product/test/config.xml");

//		ProductDao productDao = (ProductDao) context.getBean("productDao");
//		Product product = new Product();
//		product.setId(1);
//		product.setName("IPhone");
//		product.setDesc("It is a decent phone");
//		product.setPrice(799);

//		productDao.create(product);
//		productDao.update(product);
//		productDao.delete(product);
//		Product product = productDao.find(3);
//		List<Product> listOfProducts = productDao.findAll();
//		for (Iterator<Product> iterator = listOfProducts.iterator(); iterator.hasNext();) {
//			System.out.println(iterator.next());
//		}

		PassengerDAO pdao = (PassengerDAO) context.getBean("passengerDao");
//		Passenger passenger = new Passenger();
//		passenger.setId(6);
//		passenger.setFirstName("Shyam");
//		passenger.setLastName("Rajput");

//		int createdPassenger = pdao.createPassenger(passenger);
//		pdao.updatePassenger(passenger);
//		pdao.deletePassenger(passenger);
//		Passenger passenger = pdao.getPassenger(5);
//		System.out.println(passenger);
//		System.out.println(createdPassenger);
		List<Passenger> passengerList = pdao.getAllPassenger();
		for (Iterator iterator = passengerList.iterator(); iterator.hasNext();) {
			Passenger passenger = (Passenger) iterator.next();
			System.out.println(passenger);
		}
	}

}
