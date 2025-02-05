package com.crm.project.dao;

import com.crm.project.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface ContactRepo extends JpaRepository<Contact, Long>{
    
}
