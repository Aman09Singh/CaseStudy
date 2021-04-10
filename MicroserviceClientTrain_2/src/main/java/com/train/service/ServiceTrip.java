package com.train.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.model.ModelTrip;
import com.train.repository.RepositoryTrip;

@Service
public class ServiceTrip {

	@Autowired
	RepositoryTrip tripRepository;
	
	public ModelTrip createTrip(ModelTrip trip) {
		return tripRepository.save(trip);
	}
	
	public ModelTrip updateTrip(String tripId, ModelTrip trip){
        Optional<ModelTrip> tripData = tripRepository.findByTripId(tripId);
        if(tripData.isPresent()){
            return tripRepository.save(trip);
        }
        return trip;
    }
	
	public void deleteTrip(String tripId){
        tripRepository.deleteByTripId(tripId);
    }

    public Optional<ModelTrip> getTrip(String tripId){
        return tripRepository.findByTripId(tripId);
    }

    public List<ModelTrip> getAllTrips(){
        return tripRepository.findAll();
    }
}
