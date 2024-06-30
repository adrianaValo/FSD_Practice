package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.entity.Fare;

@Repository
public interface FareRepository extends JpaRepository<Fare, Integer> {
	@Query("select cf.amount from Fare cf where cf.departure = :departure and cf.destination = :destination and cf.typeofcab= :typeofcab")
	Float findAmountByDestinationAndDepartureAndTypeofcab(
	        @Param("departure") String departure,
	        @Param("destination") String destination,
	        @Param("typeofcab") String typeofcab
	    );
}

