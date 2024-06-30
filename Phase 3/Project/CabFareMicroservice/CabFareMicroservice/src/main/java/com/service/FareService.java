package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Fare;
import com.repository.FareRepository;

@Service
public class FareService {
	
	@Autowired
	FareRepository fareRepository;
	
	 public String createFare(Fare fare) {
	        Optional<Fare> result = fareRepository.findById(fare.getFid());
	        if(result.isPresent()) {
	            return "Fare already exists";
	        } else {
	            fareRepository.save(fare);
	            return "Fare created";
	        }
	    }

	    public Float getFareAmount(String departure, String destination, String typeofcab) {
	        return fareRepository.findAmountByDestinationAndDepartureAndTypeofcab(departure, destination, typeofcab);
	    }

}
