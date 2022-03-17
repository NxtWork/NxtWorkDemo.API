package com.app.model;

import java.util.List;
import java.util.UUID;

public class Vacancy {
    private UUID id;
    private String title;
    private String description;
    private String thumbnail_image;
    private com.app.model.Contacts contacts;
    private List<com.app.model.Requirement> requirements;
    private com.app.model.Company company;
    private UUID companyId;
    private String salary;

    public Vacancy(UUID id, String title, String description, String thumbnail_image, Contacts contacts, List<Requirement> requirements, Company company, UUID companyId, String salary) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.thumbnail_image = thumbnail_image;
        this.contacts = contacts;
        this.requirements = requirements;
        this.company = company;
        this.companyId = companyId;
        this.salary = salary;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public String getThumbnail_image() {
        return thumbnail_image;
    }

    public void setThumbnail_image(String thumbnail_image) {
        this.thumbnail_image = thumbnail_image;
    }

    public com.app.model.Contacts getContacts() {
        return contacts;
    }

    public void setContacts(com.app.model.Contacts contacts) {
        this.contacts = contacts;
    }

    public List<com.app.model.Requirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<com.app.model.Requirement> requirements) {
        this.requirements = requirements;
    }

    public com.app.model.Company getCompany() {
        return company;
    }

    public void setCompany(com.app.model.Company company) {
        this.company = company;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
