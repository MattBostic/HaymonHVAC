package com.mb.HaymonHVAC.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService{
    @Autowired
    private CustomerRepository repo;

    @Override
    public List<Customer> findAll() {
        return repo.findAll();
    }

    @Override
    public void persistCustomer(Customer customer) {
        repo.save(customer);
    }

    @Override
    public List<Customer> findByFirstName(String firstName) {
        return repo.findByFirstName(firstName);
    }

    @Override
    public List<Customer> findByLastName(String lastName) {
        return repo.findByLastName(lastName);
    }

    @Override
    public List<Customer> findByEmail(String email) {
        return repo.findByEmail(email);
    }
}
