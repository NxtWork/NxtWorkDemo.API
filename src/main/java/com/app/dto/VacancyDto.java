package com.app.dto;

import com.app.model.common.Contacts;
import com.app.model.jobs.Company;

public interface VacancyDto {
    String getTitle();
    void setTitle(String title);

    // TODO: mapping solution
    String getCompany();
    void setCompany(String company);

    String getSalary();
    void setSalary(String salary);

    Contacts getContacts();
    void setContacts(Contacts contacts);
}
