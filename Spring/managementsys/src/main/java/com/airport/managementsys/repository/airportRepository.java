package com.airport.managementsys.repository;

import com.airport.managementsys.entity.Airport;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface airportRepository extends CrudRepository<Airport,String>{
    
}
