package com.mb.HaymonHVAC.customer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CustomerServiceImpTest {

    @Autowired
    CustomerServiceImp service;
    Customer customer;

    @BeforeEach
    void setUp() {
        customer = Customer.builder()
                .firstName("Decker")
                .lastName("Bostic")
                .email("DeckerBostic@gmail.com")
                .build();
    }

    @Test
    void findByEmail() {
        assertEquals(0, service.findAll().size());
        service.persistCustomer(customer);
        assertEquals(1, service.findByEmail("DeckerBostic@gmail.com").size(),
                "Find record based on Email address");
    }
}