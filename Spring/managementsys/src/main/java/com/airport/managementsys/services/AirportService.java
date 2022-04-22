package com.airport.managementsys.services;

import java.util.ArrayList;
import java.util.List;

import com.airport.managementsys.entity.Airport;
import com.airport.managementsys.repository.airportRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportService {

    @Autowired
    airportRepository AirportRepository;

    public List<Airport> getAllAirports(){
        List<Airport> airportList =new ArrayList<>();
        AirportRepository.findAll().forEach(airportList::add);
        return airportList;
    }

    public Airport getAiportData(String airportCode){
        return AirportRepository.findById(airportCode).get();
    }

    public void addAirport(Airport airport){
        AirportRepository.save(airport);
    }

    public void updateAirport(Airport airport){
        AirportRepository.save(airport);
    }

    public void deleteAirport(String airportCode){
        AirportRepository.deleteById(airportCode);
    }
}
