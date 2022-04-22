package com.airport.managementsys.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airport {

    @Id
    private String airportCode;
    
    private String airportName;
    private String city;

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public Airport(String airportCode, String airportName, String city) {
        super();
        this.airportCode = airportCode;
        this.airportName = airportName;
        this.city = city;
    }
    

    
}
