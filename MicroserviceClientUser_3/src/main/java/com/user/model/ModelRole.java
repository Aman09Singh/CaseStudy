package com.user.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("role")
public class ModelRole {

	 private String email;
	 private String role;
	 
	 public ModelRole() {
		 
	 }
	 
	public ModelRole(String email, String role) {
		super();
		this.email = email;
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	 
	
	 
}
