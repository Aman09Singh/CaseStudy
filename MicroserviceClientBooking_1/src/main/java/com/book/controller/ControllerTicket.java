package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.model.ModelTicket;
import com.book.service.ServiceTicket;


@RestController
@RequestMapping("/ticket")
public class ControllerTicket {

	

	@Autowired
	private ServiceTicket ticketService;
	
	@PostMapping("/add")
	public ModelTicket addTicket(@RequestBody ModelTicket ticket) {
		return ticketService.createTicket(ticket);
	}
	
	@PutMapping("/update/{ticketId}")
	public ModelTicket updateTicket(@PathVariable String ticketId, @RequestBody ModelTicket ticket) {
		return ticketService.updateTicket(ticketId, ticket);
	}
	
	@DeleteMapping("/delete/{ticketId}")
	public String deleteTicket(@PathVariable String ticketId) {
		ticketService.deleteTicket(ticketId);
		return "Ticket is deleted";
	}
	
	@GetMapping("get/{ticketId}")
	public ModelTicket getTicket(@PathVariable String ticketId) {
		return ticketService.getTicket(ticketId);
	}
	
//	//get ticket using PNR
//	@GetMapping("get/{PNR}")
//	public ModelTicket getTicketByPNR(@PathVariable String PNR) {
//		return ticketService.getTicketPNR(PNR);
//	}
}
