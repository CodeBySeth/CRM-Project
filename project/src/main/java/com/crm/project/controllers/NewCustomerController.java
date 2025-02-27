package com.crm.project.controllers;

import com.crm.project.entities.Customer;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

import com.crm.project.controllers.services.NewCustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin

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
    @GetMapping("/users")
    public List<Customer> getUsers() {
        return userService.getAllUsers();
    }
}
