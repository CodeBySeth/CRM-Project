package com.crm.project.controllers.services;

import org.springframework.stereotype.Service;
import com.crm.project.dao.CustomerRepo;
import com.crm.project.entities.Customer;
import java.util.List;

@Service
public class NewCustomer {
    private final CustomerRepo customerRepo;

    public NewCustomer(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer saveUser(Customer user) {
        return customerRepo.save(user);
    }

    public List<Customer> getAllUsers() {
        return customerRepo.findAll();
    }
}
