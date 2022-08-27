package com.ironhack.demo.repository;

import com.ironhack.demo.model.Aircraft;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AircraftRepositoryTest {

    @Autowired
    AircraftRepository aircraftRepository;

    @AfterEach
    void tearDown() {
        aircraftRepository.deleteAll();
    }

    // 5. Write tests to verify your ability to create new customers.
    @Test
    public void whenSavingAircraft_shouldCreateNewAircraft() {
    Aircraft aircraft = new Aircraft(3456, "Boeing3524", 200);

    aircraftRepository.save(aircraft);

    assertTrue(aircraftRepository.existsById(3456));
    }

    // 10. Write tests to verify your ability to find aircraft with names containing “Boeing”.
    @Test
    public void whenSearchingAircraft_shouldFindAircraftContainingBoeing() {

    }

}