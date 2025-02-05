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
public class Issues {
    public Issues(String issue_n, String desc, int issue_lvl) {
        this.issue_name = issue_n;
        this.description = desc;
        this.issue_level = issue_lvl;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false)
    private Long id;

    @Column(name = "issue_name")
    private String issue_name;

    @Column(name = "description")
    private String description;

    @Column(name = "issue_level")
    private int issue_level;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;
}
