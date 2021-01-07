package com.learning.ticketapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
	
	@Autowired
	private TicketRepository ticketRepository;
	
	public List<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		
		List<Ticket> tickets = new ArrayList<>();
		ticketRepository.findAll()
		.forEach(tickets::add);
		
		return tickets;
	}

	public Ticket getTopic(String tKey) {
		// TODO Auto-generated method stub
		
		return ticketRepository.findById(tKey).get();
	}

	public Ticket createTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		ticketRepository.save(ticket);
	
		return ticket;
	}

	public Ticket updateTicket(String key, Ticket ticket) {
		// TODO Auto-generated method stub
		ticketRepository.save(ticket);
		
		return null;
	}

	public void deleteTicket(String key) {
		// TODO Auto-generated method stub
		ticketRepository.deleteById(key);
		
	}

}
