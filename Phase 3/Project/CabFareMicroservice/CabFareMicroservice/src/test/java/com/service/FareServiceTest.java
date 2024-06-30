package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.entity.Fare;

@SpringBootTest
class FareServiceTest {
	
	@Autowired
	FareService fareService;
	
	@Test
	void testCreateFare() {
		Fare far = new Fare();
		far.setFid(6);
		far.setDeparture("Vama Veche");
		far.setDestination("Venus");
		far.setTypeofcab("Renault");
		far.setAmount(200);
		String result = fareService.createFare(far);
		assertEquals("Fare created", result);
		
		
		
	}

	@Test
	
	void testGetFareAmount() {
		String departure = "Timisoara";
		String destination = "Campina";
		String typeofcab = "Opel";
		float result = fareService.getFareAmount(departure, destination, typeofcab);
		assertEquals(800, result);
		
		
	}

}
