package com.crm.project.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "contacts") // Define MongoDB collection name
@Getter
@Setter
@NoArgsConstructor
public class Contact {

    public Contact(String firstName, String lastName, String address, String postalCode, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.postalCode = postalCode;
        this.phone = phone;
        this.createDate = new Date();
        this.lastUpdate = new Date();
    }

    @Id
    private String id; // MongoDB uses String IDs (ObjectId)

    @Field(name = "customer_first_name")
    private String firstName;

    @Field(name = "customer_last_name")
    private String lastName;

    @Field(name = "address")
    private String address;

    @Field(name = "postal_code")
    private String postalCode;

    @Field(name = "phone")
    private String phone;

    @Field(name = "create_date")
    private Date createDate;

    @Field(name = "last_update")
    private Date lastUpdate;
}
