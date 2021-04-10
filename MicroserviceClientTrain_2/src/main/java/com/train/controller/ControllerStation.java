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

import com.train.model.ModelStation;
import com.train.service.ServiceStation;

@RestController
@RequestMapping("/station")
public class ControllerStation {

	@Autowired
	ServiceStation stationService;
	
	@PostMapping("/add")
    public ModelStation createStation(@RequestBody ModelStation station){
        return stationService.createStation(station);
    }
	
	@PutMapping("/update/{stationCode}")
    public ModelStation updateStation(@PathVariable String stationCode, @RequestBody ModelStation station){
        return stationService.updateStation(stationCode, station);
    }
	
	@DeleteMapping("/delete/{stationCode}")
    public void deleteStation(@PathVariable String stationCode){
        stationService.deleteStation(stationCode);
    }

    @GetMapping("/get/{stationCode}")
    public ModelStation getStation(@PathVariable String stationCode){
        return stationService.getStation(stationCode);
    }
}
