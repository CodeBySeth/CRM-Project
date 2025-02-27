package com.crm.project.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "customers") // MongoDB collection
public class Customer {

    @Id
    private String id; // MongoDB uses String/ObjectId instead of Long

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phone;
    private String password;
    
    private Instant createDate = Instant.now(); // Use Instant for timestamps
    private Instant lastUpdate = Instant.now();

    private Set<String> customerIds = new HashSet<>(); // Store Employee IDs (Reference Approach)

    // Constructor
    public Customer(String fName, String lName, String addr, String phone, String email, String pass) {
        this.firstName = fName;
        this.lastName = lName;
        this.address = addr;
        this.phone = phone;
        this.email = email;
        this.password = pass;
    }

    public void setFirstName(String fname){
        this.firstName = fname;
    }

    public void setLastName(String lname){
        this.lastName = lname;
    }

    public void setAddress(String addr){
        this.address = addr;
    }

    public void setPhone(String number){
        this.phone = number;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String pass){
        this.password = pass;
    }

    // Add Employee (Reference Approach)
    public void addEmployee(String employeeId) {
        this.customerIds.add(employeeId);
    }
}
