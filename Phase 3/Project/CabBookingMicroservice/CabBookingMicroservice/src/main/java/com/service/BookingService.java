package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.entity.Booking;
import com.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	BookingRepository bookingRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	 // URL of the car-fare microservice
    private static final String CAR_FARE_SERVICE_URL = "http://CABFAREMICROSERVICE/fare/findFareAmount";

    public float findTheCarFare(String departure, String destination, String typeofcab) {
       
        String url = CAR_FARE_SERVICE_URL + "?departure=" + departure + "&destination=" + destination + "&typeofcab=" + typeofcab;

      
        Float fare = restTemplate.getForObject(url, Float.class);

        return fare != null ? fare : 0.0f;
    }

    public Booking bookCab(String emailid, String departure, String destination, String typeofcab) {
        // Find the car fare
        float amount = findTheCarFare(departure, destination, typeofcab);

        // Create a new booking
        Booking booking = new Booking();
        booking.setEmailid(emailid);
        booking.setDeparture(departure);
        booking.setDestination(destination);
        booking.setTypeofcab(typeofcab);
        booking.setAmount(amount);

        // Save the booking to the database
        bookingRepository.save(booking);

        return booking;
    }
}


