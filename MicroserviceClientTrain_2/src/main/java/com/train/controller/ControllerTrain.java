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

import com.train.model.ModelTrain;
import com.train.service.ServiceTrain;

@RestController
@RequestMapping("/trains")
public class ControllerTrain {

	@Autowired
	private ServiceTrain  trainService;
	
	@PostMapping("/add")
    public ModelTrain addTrain(@RequestBody ModelTrain train){
        return trainService.createTrain(train);
    }

    @PutMapping("/update/{trainId}")
    public ModelTrain updateTrain(@PathVariable String trainId, @RequestBody ModelTrain train){
        return trainService.updateTrain(trainId, train);
    }

    @DeleteMapping("/delete/{trainId}")
    public void deleteTrain(@PathVariable String trainId){
        trainService.deleteTrain(trainId);
    }

    @GetMapping("/get/{trainId}")
    public ModelTrain getTrain(@PathVariable String trainId){
        Optional<ModelTrain> train = trainService.getTrain(trainId);
        return train.orElseGet(ModelTrain::new);
    }

    @GetMapping("search/{fromStationCode}/{toStationCode}")
    public List<ModelTrain> searchTrains(@PathVariable String fromStationCode, @PathVariable String toStationCode){
        System.out.println(fromStationCode + " " + toStationCode);
        return trainService.searchTrainsByFromStationCodeAndToStationCode(fromStationCode, toStationCode);
    }
}
