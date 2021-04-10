package com.train.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.model.ModelTrain;
import com.train.repository.RepositoryTrain;

@Service
public class ServiceTrain {

	@Autowired
	RepositoryTrain trainRepository;
	
	public ModelTrain createTrain(ModelTrain train) {
		return trainRepository.save(train);
	}
	
	public ModelTrain updateTrain(String number, ModelTrain train){
        Optional<ModelTrain> trainData = trainRepository.findByNumber(number);
        if(trainData.isPresent()){
            trainRepository.save(train);
        }
        return train;
    }

    public void deleteTrain(String number){
        trainRepository.deleteByNumber(number);
    }

    public Optional<ModelTrain> getTrain(String number){
        return trainRepository.findByNumber(number);
    }

    public List<ModelTrain> searchTrainsByFromStationCodeAndToStationCode(String fromStationCode, String toStationCode) {
        return trainRepository.findTrainByFromStationCodeAndToStationCode(fromStationCode, toStationCode);
    }
}

