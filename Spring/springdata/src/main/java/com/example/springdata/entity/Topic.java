package com.example.springdata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
   
    public String getTopicName() {
        return topicName;
    }
    public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Topic(String id, String topicName, String description) {
		super();
		this.id = id;
		this.topicName = topicName;
		this.description = description;
	}
	public Topic() {
	
	}
	private String topicName;
	private String description;
	
	
	
}
