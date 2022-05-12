package com.app.services;

import com.app.model.jobs.Company;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CompanyService {
    private List<Company> Companies;

    public CompanyService() {
        Companies = new ArrayList<>();

        Faker faker = new Faker();

        Company company = new Company();
        company.setId(UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"));
        company.setName(faker.company().name());
        company.setIndustry(faker.company().industry());
        company.setDescription(faker.lorem().paragraph(3));
        company.setContacts_id(UUID.randomUUID());
        company.setRating(faker.number().numberBetween(1,5));
        Companies.add(company);

        /*
        company = new Company();
        company.setId(UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"));
        company.setName(faker.company().name());
        company.setIndustry(faker.company().industry());
        company.setDescription(faker.lorem().paragraph(3));
        company.setContacts_id(UUID.randomUUID());
        company.setRating(faker.number().numberBetween(1,5));
        Companies.add(company);
        */
    }

    public List<Company> getCompanies() {
        return Companies;
    }

    public Company getCompanyById(UUID companyId) {
        for (Company com : Companies) {
            UUID comId = com.getId();
            if (comId.equals(companyId)) {
                return com;
            }
        }
        return null;
    }
}
