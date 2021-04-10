package com.user.model;

public class ModelURequest {

	private ModelUser user;
    private ModelRole role;
    
    public ModelURequest() {
    	
    }
    
	public ModelURequest(ModelUser user, ModelRole role) {
		super();
		this.user = user;
		this.role = role;
	}
	public ModelUser getUser() {
		return user;
	}
	public void setUser(ModelUser user) {
		this.user = user;
	}
	public ModelRole getRole() {
		return role;
	}
	public void setRole(ModelRole role) {
		this.role = role;
	}
    
    
}

