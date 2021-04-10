package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.ModelRole;
import com.user.repository.RepositoryRole;
@Service
public class ServiceRole {

	@Autowired
	private RepositoryRole roleRepository;
	
	public ModelRole createRole(ModelRole role) {
		return roleRepository.save(role);
	}
	
	public ModelRole updatRole(ModelRole role) {
		return roleRepository.save(role);
	}
	
}
