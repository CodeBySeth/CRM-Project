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

    public NewCustomerController(NewCustomer userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public Customer createUser(@RequestBody Customer user) {
        return userService.saveUser(user);
    }

    @GetMapping
    public List<Customer> getUsers() {
        return userService.getAllUsers();
    }
}
