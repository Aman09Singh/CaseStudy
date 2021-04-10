package com.train.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.train.model.ModelTrip;
import com.train.service.ServiceTrip;

@RestController
@RequestMapping("/trip")
public class ControllerTrip {

	@Autowired
	ServiceTrip tripService;
	
	@PostMapping("/add")
    public ModelTrip addTrip(@RequestBody ModelTrip trip){
        return tripService.createTrip(trip);
    }
	
	 @PutMapping("/update/{tripId}")
	    public ModelTrip updateTrip(@PathVariable String tripId, @RequestBody ModelTrip trip){
	        return tripService.updateTrip(tripId, trip);
	    }
	 
	 @GetMapping("/get/{tripId}")
	    public Optional<ModelTrip> getTrip(@PathVariable String tripId){
	        Optional<ModelTrip> trip = tripService.getTrip(tripId);
	        if(trip.isPresent()){
	            return tripService.getTrip(tripId);
	        }
	        return Optional.empty();
	    }

	    @GetMapping("/get")
	    public List<ModelTrip> getAllTrips(){
	        return tripService.getAllTrips();
	    }

	    @DeleteMapping("/delete/{tripId}")
	    public void deleteTrip(@PathVariable String tripId){
	        tripService.deleteTrip(tripId);
	    }
}
