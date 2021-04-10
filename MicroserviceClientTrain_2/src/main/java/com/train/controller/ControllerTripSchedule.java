package com.train.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.train.model.ModelTripSchedule;
import com.train.service.ServiceTripSchedule;

@RestController
@RequestMapping("trip-schedules")
public class ControllerTripSchedule {

	@Autowired
	ServiceTripSchedule tripScheduleService;
	
	@PostMapping("/add")
    public ModelTripSchedule createTripSchedule(@RequestBody ModelTripSchedule tripSchedule){
        return tripScheduleService.createTripSchedule(tripSchedule);
    }
	
	@DeleteMapping("/delete/{tripScheduleId}")
    public void deleteTripSchedule(@PathVariable String tripScheduleId){
        tripScheduleService.deleteTripSchedule(tripScheduleId);
    }
	
	 @PutMapping("/update/{tripId}")
	    public ModelTripSchedule updateTripSchedule(@PathVariable String tripId, @RequestBody ModelTripSchedule tripSchedule){
	        return tripScheduleService.updateTripSchedule(tripId, tripSchedule);
	    }
	 
	 @GetMapping("/get/{tripScheduleId}")
	    public ModelTripSchedule getTripSchedule(@PathVariable String tripScheduleId){
	        return tripScheduleService.getTripSchedule(tripScheduleId);
	    }

}
