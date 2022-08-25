package com.ironhack.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    private String flightNumber;
    private int flightMileage;
    private int idAircraft;

    //constructors
    public Flight() {}

    public Flight(String flightNumber, int flightMileage, int idAircraft) {
        this.flightNumber = flightNumber;
        this.flightMileage = flightMileage;
        this.idAircraft = idAircraft;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFlightMileage() {
        return flightMileage;
    }

    public void setFlightMileage(int flightMileage) {
        this.flightMileage = flightMileage;
    }

    public int getIdAircraft() {
        return idAircraft;
    }

    public void setIdAircraft(int idAircraft) {
        this.idAircraft = idAircraft;
    }
}
