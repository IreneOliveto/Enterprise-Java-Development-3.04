package com.ironhack.demo.service;

import com.ironhack.demo.model.Aircraft;
import com.ironhack.demo.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AircraftService {

    List<Aircraft> findAll();
}
