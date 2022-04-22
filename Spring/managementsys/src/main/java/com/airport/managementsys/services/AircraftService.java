package com.airport.managementsys.services;

import java.util.ArrayList;
import java.util.List;

import com.airport.managementsys.entity.Aircraft;
import com.airport.managementsys.repository.aircraftRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AircraftService {
    
    @Autowired
    aircraftRepository AircraftRepository;

    public List<Aircraft> getAllAircrafts(String airportCode){
        List<Aircraft> aircraftList =new ArrayList<>();
        AircraftRepository.findByAirportCode(airportCode).forEach(aircraftList::add);
        return aircraftList;
    }

    public void addAircraft(Aircraft aircraft){
        AircraftRepository.save(aircraft);
    }

    public void updateAircraft(Aircraft aircraft){
        AircraftRepository.save(aircraft);
    }

    public void deleteAircraft(String aircraftCode){
        AircraftRepository.deleteById(aircraftCode);
    }

    public Aircraft getAircraft(String aircraftCode){
        return AircraftRepository.findById(aircraftCode).get();
    }
}
