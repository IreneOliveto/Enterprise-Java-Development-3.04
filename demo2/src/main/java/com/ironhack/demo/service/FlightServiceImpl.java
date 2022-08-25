package com.ironhack.demo.service;

import com.ironhack.demo.model.Customer;
import com.ironhack.demo.model.Flight;
import com.ironhack.demo.repository.CustomerRepository;
import com.ironhack.demo.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {
    @Autowired
    FlightRepository flightRepository;
    @Override
    public List<Flight> findAll() {
        return flightRepository.findAll();
    }
}
