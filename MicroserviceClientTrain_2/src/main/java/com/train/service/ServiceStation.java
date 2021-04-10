package com.train.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.model.ModelStation;
import com.train.repository.RepositoryStation;

@Service
public class ServiceStation {

	@Autowired
	RepositoryStation stationRepository;
	
	public ModelStation createStation(ModelStation station) { 
		return stationRepository.save(station);
	}
	
	public void deleteStation(String stationCode){
        stationRepository.deleteByCode(stationCode);
    }

    public ModelStation updateStation(String stationCode, ModelStation station) {
        Optional<ModelStation> stationData = stationRepository.findByCode(stationCode, station);
        if(stationData.isPresent()){
            stationRepository.save(station);
        }
        return station;
    }

    public ModelStation getStation(String stationCode){
        return stationRepository.findByCode(stationCode);
    }
}
