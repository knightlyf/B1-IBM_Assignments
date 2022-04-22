package com.airport.managementsys.controller;

import java.util.List;

import com.airport.managementsys.entity.Airport;
import com.airport.managementsys.services.AirportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirportController {
    
    @Autowired
    private AirportService airportService;

   @RequestMapping("/airports")
   public List<Airport> getAiportData(){
       return airportService.getAllAirports();   
   }

    @RequestMapping("/airports/{airportCode}")
    public Airport getAirportdata(@PathVariable String airportCode){
        return airportService.getAiportData(airportCode);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/airports")
    public void addAirport(@RequestBody Airport airport){
        airportService.addAirport(airport);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/airports/{airportCode}")
    public void updateAirport(@RequestBody Airport airport, @PathVariable String airportCode){
        airportService.updateAirport(airport);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/airports/{airportCode}")
    public void deleteAirport(@PathVariable String airportCode){
        airportService.deleteAirport(airportCode);
    }
}
