package com.ironhack.demo.repository;

import com.ironhack.demo.model.Customer;
import org.assertj.core.api.Assert;
import org.assertj.core.util.VisibleForTesting;
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

    // 4. Write tests to verify your ability to create new customers.
    @Test
    public void whenSavingCustomer_shouldCreateNewCustomer() {
        Customer customer = new Customer(34, "Jane", "Gold", 5789);

        customerRepository.save(customer);

        assertTrue(customerRepository.existsById(34));
    }

    // 7. Write tests to verify your ability to find customers by name.
    @Test
    public void whenSearchingCustomerByName_shouldFindCustomerByName() {
        Customer customerJane = new Customer(34, "Jane", "Gold", 5789);

        customerRepository.save(customerJane);

        assertEquals(customerJane.getCustomerName(), "Jane");
    }

    // 8. Write tests to verify your ability to find customers by status.
    @Test
    public void whenSearchingCustomerByStatus_shouldFindCustomerByStatus() {
        Customer customerJane = new Customer(34, "Jane", "Gold", 5789);

        customerRepository.save(customerJane);

        assertEquals(customerJane.getCustomerStatus(), "Gold");
    }


}