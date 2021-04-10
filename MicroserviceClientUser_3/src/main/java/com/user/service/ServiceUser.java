package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.ModelUser;
import com.user.repository.RepositoryUser;

@Service
public class ServiceUser {

	@Autowired
	private RepositoryUser userRepository;
	
	public ModelUser createUser(ModelUser user) {
		return userRepository.save(user);
	}
	
	public void updateUser(String email, ModelUser user) {
		ModelUser newData = userRepository.findByEmail(email);
		if(newData != null) {
			userRepository.save(user);
		}
		
		userRepository.save(user);	
	}
	
	public ModelUser searchUser(String email) {
		return userRepository.findByEmail(email);
	}
	
	public ModelUser findUser(String email) {
		return userRepository.findByEmail(email);
	}
	
	public void deleteUser(String email) {
		userRepository.deleteByEmail(email);
	}
}

