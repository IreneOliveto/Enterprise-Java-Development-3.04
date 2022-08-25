package com.ironhack.demo.repository;

import com.ironhack.demo.model.Customer;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerRepositoryTest {
    @Autowired
    CustomerRepository customerRepository;

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    public void whenSavingCustomer_shouldCreateNewCustomer() {
        Customer customer = new Customer(34, "Jane", "Gold", 5789);

        customerRepository.save(customer);

        assertTrue(customerRepository.existsById(34));
    }
}