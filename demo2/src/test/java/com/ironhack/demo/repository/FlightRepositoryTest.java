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

    // 6. Write tests to verify your ability to create new customers.
    @Test
    public void whenSavingFlight_shouldCreateNewFlight() {
        Flight flight = new Flight("DL122", 9000, 1 );

        flightRepository.save(flight);

        assertTrue(flightRepository.existsById("DL122"));
    }

    //9. Write tests to verify your ability to find flights by flight number.
   @Test
   public void whenSearchingFlight_shouldFindFlightByFlightNumber() {
    Flight flight = new Flight("DL143", 9000, 2 );

    flightRepository.save(flight);

    assertEquals(flight.getFlightNumber(), "DL143");
   }
}