package com.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.user.model.ModelRole;

@Repository
public interface RepositoryRole extends MongoRepository<ModelRole, String>{

}
