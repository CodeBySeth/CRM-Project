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
    private String postalCode;
    private String phone;
    
    private Instant createDate = Instant.now(); // Use Instant for timestamps
    private Instant lastUpdate = Instant.now();

    private Set<String> customerIds = new HashSet<>(); // Store Employee IDs (Reference Approach)

    // Constructor
    public Customer(String fName, String lName, String addr, String postal, String phone) {
        this.firstName = fName;
        this.lastName = lName;
        this.address = addr;
        this.postalCode = postal;
        this.phone = phone;
    }

    // Add Employee (Reference Approach)
    public void addEmployee(String employeeId) {
        this.customerIds.add(employeeId);
    }
}
