package com.train.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.train.model.ModelTripSchedule;

@Repository
public interface RepositoryTripSchedule extends MongoRepository<ModelTripSchedule, String>{

	public void deleteByTripId(String tripId);

    public ModelTripSchedule findByTripId(String tipID);
}
