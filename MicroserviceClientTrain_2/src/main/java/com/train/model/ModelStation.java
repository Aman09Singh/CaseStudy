package com.train.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("station")
public class ModelStation {

	@Id
	@Indexed
	private String code;
	private String name;
	private String zone;
	private String state;
	
	public ModelStation() {
		
	}
	
	public ModelStation(String code, String name, String zone, String state) {
		super();
		this.code = code;
		this.name = name;
		this.zone = zone;
		this.state = state;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
