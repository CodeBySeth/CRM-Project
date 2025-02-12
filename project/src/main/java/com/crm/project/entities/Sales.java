package com.crm.project.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "sales") // MongoDB collection name
@Getter
@Setter
@NoArgsConstructor
public class Sales {

    public Sales(String salesName, String description, int salesLevel) {
        this.salesName = salesName;
        this.description = description;
        this.salesLevel = salesLevel;
        this.createDate = new Date();
        this.lastUpdate = new Date();
    }

    @Id
    private String id; // MongoDB uses String IDs (ObjectId)

    @Field(name = "sales_name")
    private String salesName;

    @Field(name = "description")
    private String description;

    @Field(name = "sales_level")
    private int salesLevel;

    @Field(name = "create_date")
    private Date createDate;

    @Field(name = "last_update")
    private Date lastUpdate;
}
