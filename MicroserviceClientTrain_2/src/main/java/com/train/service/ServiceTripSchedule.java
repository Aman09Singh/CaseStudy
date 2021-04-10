package com.train.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.model.ModelTripSchedule;
import com.train.repository.RepositoryTripSchedule;

@Service
public class ServiceTripSchedule {

	@Autowired
	RepositoryTripSchedule tripRepository;
	
	public ModelTripSchedule createTripSchedule(ModelTripSchedule tripSchedule){
        return tripRepository.save(tripSchedule);
    }
	
	public ModelTripSchedule updateTripSchedule(String tripId, ModelTripSchedule tripSchedule) {
        Optional<ModelTripSchedule> tripScheduleData = tripRepository.findById(tripId);
        if(tripScheduleData.isPresent()){
            tripRepository.save(tripSchedule);
        }
        return tripSchedule;
    }
	
	public void deleteTripSchedule(String tripId){
        tripRepository.deleteByTripId(tripId);
    }

    public ModelTripSchedule getTripSchedule(String tripId){
        return tripRepository.findByTripId(tripId);
    }
}
