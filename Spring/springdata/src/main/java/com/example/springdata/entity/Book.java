package com.example.springdata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
    
    @Id
    private String id;
    private String bookDescription;
    private String author;

    @ManyToOne
    private Topic topic;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
    public Book(String id, String bookDescription, String author, String topicId) {
        super();
        this.id = id;
        this.bookDescription = bookDescription;
        this.author = author;
        this.topic = new Topic(topicId,"","");
    }
    
    
}
