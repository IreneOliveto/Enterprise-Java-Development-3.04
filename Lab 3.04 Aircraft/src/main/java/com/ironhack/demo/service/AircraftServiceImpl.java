package com.ironhack.demo.service;

import com.ironhack.demo.model.Aircraft;
import com.ironhack.demo.repository.AircraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AircraftServiceImpl implements AircraftService {

    @Autowired
    private AircraftRepository aircraftRepository;

    @Override
    public List<Aircraft> findAll() {
        return aircraftRepository.findAll();
    }



}
