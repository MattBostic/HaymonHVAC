package com.mb.HaymonHVAC.customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<Customer> findAll();
    void persistCustomer(Customer customer);
    List<Customer> findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);
    List<Customer> findByEmail(String email);
}
