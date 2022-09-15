package com.ironhack.demo.controller;

import com.ironhack.demo.model.Aircraft;
import com.ironhack.demo.model.Flight;
import com.ironhack.demo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    FlightService flightService;

    @GetMapping("/flight")
    public List<Flight> listFlight() {
        return flightService.findAll();
    }
}
