package com.airport.managementsys.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Aircraft {
    @Id
    private String aircraftCode;
    private String type;
    private String owner;

    @ManyToOne
    private Airport airport;

  
    public String getAircraftCode() {
        return aircraftCode;
    }

    public void setAircraftCode(String aircraftCode) {
        this.aircraftCode = aircraftCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }
    
    public Aircraft(String aircraftCode, String type, String owner,String airportCode) {
        super();
        this.aircraftCode = aircraftCode;
        this.type = type;
        this.owner = owner;
        this.airport = new Airport(airportCode,"","");
    }
}
