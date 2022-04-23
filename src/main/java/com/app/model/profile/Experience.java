package com.app.model.profile;

import java.util.UUID;

public class Experience {
    private UUID id;
    private String company_name;
    private String vacancy_name;
    private String duration;

    public Experience(UUID id, String company_name, String vacancy_name, String duration) {
        this.id = id;
        this.company_name = company_name;
        this.vacancy_name = vacancy_name;
        this.duration = duration;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getVacancy_name() {
        return vacancy_name;
    }

    public void setVacancy_name(String vacancy_name) {
        this.vacancy_name = vacancy_name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
