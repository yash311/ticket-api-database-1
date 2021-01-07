package com.learning.ticketapi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, String>{    // <Model class, datatype of primary key>
	
}
