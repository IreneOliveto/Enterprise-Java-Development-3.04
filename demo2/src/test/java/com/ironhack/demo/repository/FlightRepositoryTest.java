package com.ironhack.demo.repository;

import com.ironhack.demo.model.Flight;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FlightRepositoryTest {

    @Autowired
    FlightRepository flightRepository;

    @AfterEach
    void tearDown() {
        flightRepository.deleteAll();
    }

    @Test
    public void whenSavingFlight_shouldCreateNewFlight() {
        Flight flight = new Flight("2345", 9000, 1234 );

        flightRepository.save(flight);

        assertTrue(flightRepository.existsById(1234));
    }

}