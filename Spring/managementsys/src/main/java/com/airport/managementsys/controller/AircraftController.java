package com.airport.managementsys.controller;

import java.util.List;

import com.airport.managementsys.entity.Aircraft;
import com.airport.managementsys.entity.Airport;
import com.airport.managementsys.services.AircraftService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AircraftController {
    
    @Autowired
    AircraftService aircraftService;
    
    @RequestMapping("/airports/{airportCode}/aircrafts")
    public List<Aircraft> getAircrafts(@PathVariable String airportCode){
        return aircraftService.getAllAircrafts(airportCode);
    }

    @RequestMapping("/airports/{airportCode}/aircrafts/{aircraftCode}")
    public Aircraft getAircraft(@PathVariable String aircraftCode){
        return aircraftService.getAircraft(aircraftCode);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/airports/{airportCode}/aircrafts")
    public void addAircradt(@RequestBody Aircraft aircraft, @PathVariable String airportCode){
        aircraft.setAirport(new Airport(airportCode, "", ""));
        aircraftService.addAircraft(aircraft);
    }

    @RequestMapping(method = RequestMethod.PUT, value= "/airports/{airportCode}/aircrafts/{aircraftCode}")
    public void updateAircraft(@RequestBody Aircraft aircraft, @PathVariable String airportCode,@PathVariable String aircraftCode){
        aircraft.setAirport(new Airport(aircraftCode, "", ""));
        aircraftService.updateAircraft(aircraft);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/airports/{airportCode}/aircrafts/{aircraftCode}")
    public void deleteAircraft(@PathVariable String aircraftCode){
        aircraftService.deleteAircraft(aircraftCode);
    }
}
