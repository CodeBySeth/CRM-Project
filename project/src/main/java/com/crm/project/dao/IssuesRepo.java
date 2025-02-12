package com.crm.project.dao;

import com.crm.project.entities.Sales;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssuesRepo extends MongoRepository<Sales, Long>{
    
}
