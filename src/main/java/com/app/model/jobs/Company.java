package com.app.model.jobs;

import com.app.model.common.Contacts;

import java.util.UUID;

public class Company {
    private UUID id;
    private String name;
    private String industry;
    private String description;
    private double rating;
    private Contacts contacts;

    public Company(UUID id, String name, String industry, String description, double rating, Contacts contacts) {
        this.id = id;
        this.name = name;
        this.industry = industry;
        this.description = description;
        this.rating = rating;
        this.contacts = contacts;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }
}
