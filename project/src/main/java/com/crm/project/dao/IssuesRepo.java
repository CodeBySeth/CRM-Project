package com.crm.project.dao;

import com.crm.project.entities.Issues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface IssuesRepo extends JpaRepository<Issues, Long>{
    
}
