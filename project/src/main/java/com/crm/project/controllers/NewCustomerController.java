package com.crm.project.controllers;

import com.crm.project.entities.Customer;
import com.crm.project.controllers.services.NewCustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NewCustomerController {

    @Autowired
    private final NewCustomer userService;

    // Constructor
    public NewCustomerController(NewCustomer userService) {
        this.userService = userService;
    }

    // Get user from front-end and save to database
    @PostMapping("/save")
    public Customer createUser(@RequestBody Customer user) {
        return userService.saveUser(user);
    }

    // Get all users from database
    @GetMapping
    public List<Customer> getUsers() {
        return userService.getAllUsers();
    }
}
