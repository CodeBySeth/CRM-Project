package com.crm.project.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "issues") // MongoDB collection name
@Getter
@Setter
@NoArgsConstructor
public class Issues {

    public Issues(String issueName, String description, int issueLevel) {
        this.issueName = issueName;
        this.description = description;
        this.issueLevel = issueLevel;
        this.createDate = new Date();
        this.lastUpdate = new Date();
    }

    @Id
    private String id; // MongoDB uses String IDs (ObjectId)

    @Field(name = "issue_name")
    private String issueName;

    @Field(name = "description")
    private String description;

    @Field(name = "issue_level")
    private int issueLevel;

    @Field(name = "create_date")
    private Date createDate;

    @Field(name = "last_update")
    private Date lastUpdate;
}
