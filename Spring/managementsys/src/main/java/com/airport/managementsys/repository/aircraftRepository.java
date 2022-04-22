package com.airport.managementsys.repository;

import java.util.List;

import com.airport.managementsys.entity.Aircraft;

import org.springframework.data.repository.CrudRepository;

public interface aircraftRepository  extends CrudRepository<Aircraft,String>{
    
    public List<Aircraft> findByAirportCode(String airportCode);
}
    
