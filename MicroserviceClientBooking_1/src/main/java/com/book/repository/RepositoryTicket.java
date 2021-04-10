package com.book.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.book.model.ModelTicket;
@Repository
public interface RepositoryTicket extends MongoRepository<ModelTicket, String>{

public Optional<ModelTicket> findByTicketId(String ticketId);
	
	public void deleteByTicketId(String ticketId);
	
//	public ModelTicket findByTicketByPNR(String PNR);
	
}
