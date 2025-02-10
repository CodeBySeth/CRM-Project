package com.crm.project.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.crm.project.entities.Customer;

@Repository
public interface CustomerRepo extends MongoRepository<Customer, String> {
}
