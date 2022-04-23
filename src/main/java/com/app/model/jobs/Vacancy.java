package com.app.model.jobs;

import com.app.model.common.Contacts;

import java.util.List;
import java.util.UUID;

public class Vacancy {
    private UUID id;
    private String title;
    private String description;
    private String thumbnail_image;
    private UUID contacts_id;
    private UUID requirements_id;
    private UUID company_id;
    private String salary;

    public Vacancy() {}

    public Vacancy(UUID id, String title, String description, String thumbnail_image, UUID contacts_id, UUID requirements_id, UUID company_id, UUID companyId, String salary) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.thumbnail_image = thumbnail_image;
        this.contacts_id = contacts_id;
        this.requirements_id = requirements_id;
        this.company_id = company_id;
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

    public UUID getContacts_id() {
        return contacts_id;
    }

    public void setContacts_id(UUID contacts_id) {
        this.contacts_id = contacts_id;
    }

    public UUID getRequirements_id() {
        return requirements_id;
    }

    public void setRequirements_id(UUID requirements_id) {
        this.requirements_id = requirements_id;
    }

    public UUID getCompany_id() {
        return company_id;
    }

    public void setCompany_id(UUID company_id) {
        this.company_id = company_id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
