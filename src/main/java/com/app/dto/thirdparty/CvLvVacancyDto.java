package com.app.dto.thirdparty;

import com.app.dto.VacancyDto;
import com.app.model.common.Contacts;
import com.app.model.jobs.Company;

public class CvLvVacancyDto implements VacancyDto {
    private String name;
    private String company;
    private String salary;
    private Contacts contacts;
    private String due_date;
    private String link;

    public CvLvVacancyDto() {}

    public CvLvVacancyDto(String name, String company, String salary, Contacts contacts, String due_date, String link) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.contacts = contacts;
        this.due_date = due_date;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String getTitle() {
        return name;
    }

    @Override
    public void setTitle(String title) {
        this.name = title;
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

    @Override
    public Contacts getContacts() {
        return contacts;
    }

    @Override
    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }
}
