package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Fare;
import com.service.FareService;

@RestController
@RequestMapping("fare")
public class FareController {
	
	@Autowired
	FareService fareService;
	
	@PostMapping("/createFare")
    public String createFare(@RequestBody Fare fare) {
        return fareService.createFare(fare);
    }

    @GetMapping("/findFareAmount")
    public Float findFareAmount(@RequestParam String departure, 
                                @RequestParam String destination, 
                                @RequestParam String typeofcab) {
        return fareService.getFareAmount(departure, destination, typeofcab);
    }
	

}
