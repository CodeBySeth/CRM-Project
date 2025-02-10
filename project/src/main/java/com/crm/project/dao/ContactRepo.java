package com.crm.project.dao;

import com.crm.project.entities.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ContactRepo extends MongoRepository<Contact, Long>{
    
}
