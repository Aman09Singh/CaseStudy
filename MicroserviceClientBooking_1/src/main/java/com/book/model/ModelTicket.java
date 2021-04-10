package com.book.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("ticket_info")
public class ModelTicket {

	@Id
	@Indexed
	private String ticketId;
    private String PNR;
    private List<ModelPassenger> passengers;
    private Boolean cancellable;
    private Date journeyDate;
    private String userId;
    private String tripScheduleId;
    
    public ModelTicket() {
    }
	public ModelTicket(String ticketId, String pNR, List<ModelPassenger> passengers, Boolean cancellable, Date journeyDate,
			String userId, String tripScheduleId) {
		super();
		this.ticketId = ticketId;
		this.PNR = pNR;
		this.passengers = passengers;
		this.cancellable = cancellable;
		this.journeyDate = journeyDate;
		this.userId = userId;
		this.tripScheduleId = tripScheduleId;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getPNR() {
		return PNR;
	}
	public void setPNR(String pNR) {
		PNR = pNR;
	}
	public List<ModelPassenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<ModelPassenger> passengers) {
		this.passengers = passengers;
	}
	public Boolean getCancellable() {
		return cancellable;
	}
	public void setCancellable(Boolean cancellable) {
		this.cancellable = cancellable;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTripScheduleId() {
		return tripScheduleId;
	}
	public void setTripScheduleId(String tripScheduleId) {
		this.tripScheduleId = tripScheduleId;
	}
	
}
