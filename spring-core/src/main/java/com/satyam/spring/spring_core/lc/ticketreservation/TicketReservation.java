package com.satyam.spring.spring_core.lc.ticketreservation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

	@PostConstruct
	private void hi() {
		System.out.println("Inside init method of TicketReservation");
	}

	@PreDestroy
	private void bye() {
		System.out.println("Inside destroy method of TicketReservation");
	}
}
