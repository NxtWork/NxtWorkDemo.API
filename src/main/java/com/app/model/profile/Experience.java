package com.app.model.profile;

public class Experience {
    private String company_name;
    private String vacancy_name;
    private String duration;

    public Experience(String company_name, String vacancy_name, String duration) {
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
}
