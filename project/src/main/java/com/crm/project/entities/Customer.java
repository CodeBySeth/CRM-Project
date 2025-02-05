package com.crm.project.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
public class Customer {


    public Customer(String fName, String lName, String addr, String postal, String phone, Division div) {
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

    /*@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "division_id")
    private Division division;*/

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<Employee> employees = new HashSet<>();

    public void add(Employee div) {
        this.setEmployees(employees);
    }
}
