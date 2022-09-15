package com.ironhack.demo.controller;

import com.ironhack.demo.model.Aircraft;
import com.ironhack.demo.model.Customer;
import com.ironhack.demo.repository.AircraftRepository;
import com.ironhack.demo.service.AircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AircraftController {
    @Autowired
    AircraftService aircraftService;

    @GetMapping("/aircraft")
    public List<Aircraft> listAircraft() {
        return aircraftService.findAll();
    }
}
