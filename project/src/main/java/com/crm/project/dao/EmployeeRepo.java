package com.crm.project.dao;

import com.crm.project.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public class EmployeeRepo extends JpaRepository<Employee, Long>{
    
}
