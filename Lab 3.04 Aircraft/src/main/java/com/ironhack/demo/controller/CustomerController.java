package com.ironhack.demo.controller;

import com.ironhack.demo.model.Customer;
import com.ironhack.demo.repository.CustomerRepository;
import com.ironhack.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;


   @GetMapping("/customer")
    public List<Customer> listCustomer() {
        return customerService.findAll();
    }

}
