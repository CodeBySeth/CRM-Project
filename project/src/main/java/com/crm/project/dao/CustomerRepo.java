package com.crm.project.dao;

import com.crm.project.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long>{
    
}
