package com.satyam.spring.spring_core.lc.ticketreservation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/satyam/spring/spring_core/lc/ticketreservation/config.xml");
		TicketReservation ticketReservation = (TicketReservation) context.getBean("ticketreservation");

		System.out.println(ticketReservation);
		context.registerShutdownHook();

	}
}
