package com.crm.project.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.implementation.bytecode.Division;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@CrossOrigin
@Entity
@Table(name="customers")
@Getter
@Setter
@NoArgsConstructor
public class Employee {


    public Employee(String fName, String lName, String addr, String postal, String phone, Division div) {
        this.firstName = fName;
        this.lastName = lName;
        this.address = addr;
        this.postal_code = postal;
        this.phone = phone;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false)
    private Long id;

    @Column(name = "customer_first_name", nullable = false)
    private String firstName;

    @Column(name = "customer_last_name", nullable = false)
    private String lastName;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "postal_code", nullable = false)
    private String postal_code;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private Set<Customer> customers = new HashSet<>();

    public void add(Customer div) {
        this.setCustomer(customer);
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
