package com.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.user.model.ModelUser;

public interface RepositoryUser extends MongoRepository<ModelUser, String>{

	 public void deleteByEmail(String email);

	    public ModelUser findByEmail(String email);
}
