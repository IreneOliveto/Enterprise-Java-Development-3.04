package com.ironhack.demo.service;

import com.ironhack.demo.model.Customer;
import com.ironhack.demo.model.Flight;

import java.util.List;

public interface FlightService {
    List<Flight> findAll();
}
