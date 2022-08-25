package com.ironhack.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aircraft")
public class Aircraft {

    @Id
    private int idAircraft;
    private String aircraftName;
    private int aircraftSeats;

    public int getIdAircraft() {
        return idAircraft;
    }

    //constructors
    public Aircraft() {}

    public Aircraft(int idAircraft, String aircraftName, int aircraftSeats) {
        this.idAircraft = idAircraft;
        this.aircraftName = aircraftName;
        this.aircraftSeats = aircraftSeats;
    }

    public void setIdAircraft(int idAircraft) {
        this.idAircraft = idAircraft;
    }

    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    public int getAircraftSeats() {
        return aircraftSeats;
    }

    public void setAircraftSeats(int aircraftSeats) {
        this.aircraftSeats = aircraftSeats;
    }
}
