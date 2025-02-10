package com.crm.project.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Document(collection = "employees")  // MongoDB Collection Name
@Getter
@Setter
@NoArgsConstructor
public class Employee {

    public Employee(String fName, String lName, String addr, String postal, String phone, String email) {
        this.firstName = fName;
        this.lastName = lName;
        this.email = email;
        this.address = addr;
        this.postal_code = postal;
        this.phone = phone;
        this.createDate = new Date();
    }

    @Id
    private String id;  // MongoDB uses String IDs

    @Field(name = "customer_first_name")
    private String firstName;

    @Field(name = "customer_last_name")
    private String lastName;

    @Field(name = "address")
    private String address;

    @Field(name = "postal_code")
    private String postal_code;

    @Field(name = "phone")
    private String phone;

    @Field(name = "email")
    private String email;

    @Field(name = "employment_year")
    private String employmentYear;

    @Field(name = "create_date")
    private Date createDate;

    @Field(name = "last_update")
    private Date lastUpdate = new Date();

    @DBRef  // MongoDB relationship instead of @OneToMany
    private Set<Customer> customers = new HashSet<>();

    public void add(Customer customer) {
        this.customers.add(customer);
    }

    @DBRef  // MongoDB relationship instead of @ManyToOne
    private Customer customer;
}
