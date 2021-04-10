package com.train.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("trip_schedule")
public class ModelTripSchedule {
	@Id
    @Indexed
    private String id;
    private Date tripDate;
    private int firstAcAvailableSeats;
    private int secondAcAvailableSeats;
    private int thirdAcAvailableSeats;
    private int FirstClassAcAvailableSeats;
    private int chairCarAcAvailableSeats;
    private int SleeperAvailableSeats;
    private String tripId;
    
    public ModelTripSchedule() {
    	
    }
    
	public ModelTripSchedule(String id, Date tripDate, int firstAcAvailableSeats, int secondAcAvailableSeats,
			int thirdAcAvailableSeats, int firstClassAcAvailableSeats, int chairCarAcAvailableSeats,
			int sleeperAvailableSeats, String tripId) {
		super();
		this.id = id;
		this.tripDate = tripDate;
		this.firstAcAvailableSeats = firstAcAvailableSeats;
		this.secondAcAvailableSeats = secondAcAvailableSeats;
		this.thirdAcAvailableSeats = thirdAcAvailableSeats;
		FirstClassAcAvailableSeats = firstClassAcAvailableSeats;
		this.chairCarAcAvailableSeats = chairCarAcAvailableSeats;
		SleeperAvailableSeats = sleeperAvailableSeats;
		this.tripId = tripId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getTripDate() {
		return tripDate;
	}
	public void setTripDate(Date tripDate) {
		this.tripDate = tripDate;
	}
	public int getFirstAcAvailableSeats() {
		return firstAcAvailableSeats;
	}
	public void setFirstAcAvailableSeats(int firstAcAvailableSeats) {
		this.firstAcAvailableSeats = firstAcAvailableSeats;
	}
	public int getSecondAcAvailableSeats() {
		return secondAcAvailableSeats;
	}
	public void setSecondAcAvailableSeats(int secondAcAvailableSeats) {
		this.secondAcAvailableSeats = secondAcAvailableSeats;
	}
	public int getThirdAcAvailableSeats() {
		return thirdAcAvailableSeats;
	}
	public void setThirdAcAvailableSeats(int thirdAcAvailableSeats) {
		this.thirdAcAvailableSeats = thirdAcAvailableSeats;
	}
	public int getFirstClassAcAvailableSeats() {
		return FirstClassAcAvailableSeats;
	}
	public void setFirstClassAcAvailableSeats(int firstClassAcAvailableSeats) {
		FirstClassAcAvailableSeats = firstClassAcAvailableSeats;
	}
	public int getChairCarAcAvailableSeats() {
		return chairCarAcAvailableSeats;
	}
	public void setChairCarAcAvailableSeats(int chairCarAcAvailableSeats) {
		this.chairCarAcAvailableSeats = chairCarAcAvailableSeats;
	}
	public int getSleeperAvailableSeats() {
		return SleeperAvailableSeats;
	}
	public void setSleeperAvailableSeats(int sleeperAvailableSeats) {
		SleeperAvailableSeats = sleeperAvailableSeats;
	}
	public String getTripId() {
		return tripId;
	}
	public void setTripId(String tripId) {
		this.tripId = tripId;
	}
    
    
    
    
}
