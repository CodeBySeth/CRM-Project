package com.crm.project.controllers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crm.project.dao.CustomerRepo;
import com.crm.project.entities.Customer;
import java.util.List;

@Service
public class NewCustomer {

    @Autowired
    private final CustomerRepo customerRepo;

    // Constructor
    public NewCustomer(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    // Save user to database
    public Customer saveUser(Customer user) {
        return customerRepo.save(user);
    }

    // Get all users from the database
    public List<Customer> getAllUsers() {
        return customerRepo.findAll();
    }
}
