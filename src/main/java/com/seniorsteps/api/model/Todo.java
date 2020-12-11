package com.seniorsteps.api.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message = "Title Is required")
    @NotEmpty(message = "This Field Must Not Be Empty")
    @Size(min = 3, message = "Title Must Be At Least 3 Characters")
    private String title;
    @NotNull(message = "Description Is Required")
    @NotEmpty(message = "This Field Must Not Be Empty")
    private  String description;
    private long timestamp;

    public Todo() {
        this.timestamp=System.currentTimeMillis();
    }

    public Todo(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.timestamp=System.currentTimeMillis();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
