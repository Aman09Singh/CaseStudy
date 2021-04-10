package com.book.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.model.ModelTicket;
import com.book.repository.RepositoryTicket;
@Service
public class ServiceTicket {

	@Autowired
	RepositoryTicket ticketRepository;
	
	public ModelTicket createTicket(ModelTicket ticket) {
		return ticketRepository.save(ticket);
	}
	
	public ModelTicket updateTicket(String ticketId, ModelTicket ticket) {
		Optional<ModelTicket> ticketOb = ticketRepository.findByTicketId(ticketId);
		if(ticketOb.isPresent()) {
			ticketRepository.save(ticket);
		}
		return ticket;
	}
	
	public void deleteTicket(String ticketId) {
		ticketRepository.deleteByTicketId(ticketId);
	}
	
	public ModelTicket getTicket(String ticketId) {
		Optional<ModelTicket> getModel = ticketRepository.findByTicketId(ticketId);
		return getModel.orElse(null);
	}
	
//	public ModelTicket getTicketPNR(String PNR) {
//		ModelTicket modelTicket = ticketRepository.findByTicketByPNR(PNR);
//		return modelTicket;
//	}
}
