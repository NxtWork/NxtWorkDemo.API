package com.app.dto.inapp;

import com.app.dto.VacancyDto;
import com.app.model.common.Contacts;
import com.app.model.jobs.Company;
import com.app.model.jobs.Requirement;

import java.util.List;
import java.util.UUID;

public class PlatformVacancyDto implements VacancyDto {
    private UUID id;
    private String title;
    private String description;
    private String thumbnail_image;
    private String contacts;
    private List<Requirement> requirements;
    private String company;
    private String salary;

    public PlatformVacancyDto() {}

    public PlatformVacancyDto(UUID id, String title, String description, String thumbnail_image, String contacts, List<Requirement> requirements, String company, String salary) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.thumbnail_image = thumbnail_image;
        this.contacts = contacts;
        this.requirements = requirements;
        this.company = company;
        this.salary = salary;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public List<Requirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<Requirement> requirements) {
        this.requirements = requirements;
    }

    @Override
    public String getContacts() {
        return contacts;
    }

    @Override
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String getSalary() {
        return salary;
    }

    @Override
    public void setSalary(String salary) {
        this.salary = salary;
    }
}
