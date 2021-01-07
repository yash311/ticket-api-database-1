package com.learning.ticketapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	
	
	// GET all
	@RequestMapping("/tickets")
	public List<Ticket> getAllTickets(){
		return ticketService.getAllTickets();
	}
	
	
	//GET with key
	@GetMapping("/tickets/{key}")
	public Ticket getTicket(@PathVariable String key) {
		return ticketService.getTopic(key);
	}
	
	
	//POST
	@PostMapping("/tickets")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketService.createTicket(ticket);
	}
	
	
	//PUT
	@RequestMapping(method=RequestMethod.PUT, value="/tickets/{key}")
	public Ticket createTicket(@PathVariable String key, @RequestBody Ticket ticket) {		
		return ticketService.updateTicket(key, ticket);
	}
	
	
	
	//DELETE
	@RequestMapping(method=RequestMethod.DELETE, value="/tickets/{key}")
	public void deleteTicket(@PathVariable String key) {
		ticketService.deleteTicket(key);
	}
}