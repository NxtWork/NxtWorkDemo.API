package com.app.services;


import com.app.dto.VacancyDto;
import com.app.dto.inapp.PlatformVacancyDto;
import com.app.dto.thirdparty.CvLvVacancyDto;
import com.app.model.CvVacancy.CvLvVacancy;
import com.app.model.common.Contacts;
import com.app.model.jobs.Company;
import com.app.model.jobs.Requirement;
import com.app.model.jobs.Vacancy;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class VacancyService {

    @Autowired
    private DataScraperCvLv dataScraperCvLv;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private ContactsService contactsService;

    private List<Vacancy> Vacancies;
    private List<Requirement> requirements;

    public VacancyService() {

        requirements = new ArrayList<Requirement>();

        requirements.add(new Requirement("English","B2"));
        requirements.add(new Requirement("Driving lessons","true"));
        requirements.add(new Requirement("Mathematics","10"));

        Vacancies = new ArrayList<Vacancy>();
        Faker faker = new Faker();

        Vacancy vacancy = new Vacancy();
        vacancy.setId(UUID.fromString("76038d6c-a887-11ec-b909-0242ac120002"));
        vacancy.setTitle(faker.job().title());
        vacancy.setDescription(faker.lorem().paragraph(3));
        vacancy.setThumbnail_image("https://www.iamexpat.nl/sites/default/files/styles/ogimage_thumb/public/cleaners-house-cleaning-services-netherlands_8.jpg");
        vacancy.setContacts_id(UUID.fromString("b3340266-d226-11ec-9d64-0242ac120002"));
        vacancy.setCompany_id(UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"));
        vacancy.setRequirements_id(UUID.randomUUID());
        vacancy.setSalary(faker.number().numberBetween(3, 7) + " EUR/h");
        Vacancies.add(vacancy);

        vacancy = new Vacancy();
        vacancy.setId(UUID.fromString("76038d6c-a887-11ec-b909-0242ac120002"));
        vacancy.setTitle(faker.job().title());
        vacancy.setDescription(faker.lorem().paragraph(3));
        vacancy.setThumbnail_image("https://www.openaccessgovernment.org/wp-content/uploads/2019/03/dreamstime_s_115214614.jpg");
        vacancy.setContacts_id(UUID.fromString("b33408c4-d226-11ec-9d64-0242ac120002"));
        vacancy.setCompany_id(UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"));
        vacancy.setRequirements_id(UUID.randomUUID());
        vacancy.setSalary(faker.number().numberBetween(3, 7) + " EUR/h");
        Vacancies.add(vacancy);

        vacancy = new Vacancy();
        vacancy.setId(UUID.fromString("76038d6c-a887-11ec-b909-0242ac120002"));
        vacancy.setTitle(faker.job().title());
        vacancy.setDescription(faker.lorem().paragraph(3));
        vacancy.setThumbnail_image("https://www.myfitnesschat.com/wp-content/uploads/2019/03/pexels-photo-1509428.jpeg");
        vacancy.setContacts_id(UUID.fromString("b33408c4-d226-11ec-9d64-0242ac120002"));
        vacancy.setCompany_id(UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"));
        vacancy.setRequirements_id(UUID.randomUUID());
        vacancy.setSalary(faker.number().numberBetween(3, 7) + " EUR/h");
        Vacancies.add(vacancy);

        /*
        Vacancies.add(new Vacancy(UUID.fromString("76038d6c-a887-11ec-b909-0242ac120002"),"Apkopējs","gribu stradat","https://www.iamexpat.nl/sites/default/files/styles/ogimage_thumb/public/cleaners-house-cleaning-services-netherlands_8.jpg",
                new Contacts("371111","a.a@gmail.com","riga"),requirements,
                new Company(UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"),"NxtWork","IT","Good company",8.8,new Contacts("371111","a.a@gmail.com","riga")),UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"), "5$"));

        Vacancies.add(new Vacancy(UUID.fromString("76038fc4-a887-11ec-b909-0242ac120002"),"Teacher","work hard","https://www.openaccessgovernment.org/wp-content/uploads/2019/03/dreamstime_s_115214614.jpg",
                new Contacts("371111","a.a@gmail.com","riga"),requirements,
                new Company(UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"),"NxtWork","IT","Good company",8.8,new Contacts("371111","a.a@gmail.com","riga")),UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"), "14LT"));

        Vacancies.add(new Vacancy(UUID.fromString("7603910e-a887-11ec-b909-0242ac120002"),"IT Manager","dont work","https://www.myfitnesschat.com/wp-content/uploads/2019/03/pexels-photo-1509428.jpeg",
                new Contacts("371111","a.a@gmail.com","riga"),requirements,
                new Company(UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"),"NxtWork","IT","Good company",8.8,new Contacts("371111","a.a@gmail.com","riga")),UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"), "11USD"));

        Vacancies.add(new Vacancy(UUID.fromString("ff4f9b0a-ab67-11ec-b909-0242ac120002"),"Daunis","sussy baka gay","https://d1ngglk168riv7.cloudfront.net/n/wp-content/uploads/2020/10/04182006/Main-Picture-scaled.jpg",
                new Contacts("371111","a.a@gmail.com","riga"),requirements,
                new Company(UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"),"NxtWork","IT","Good company",8.8,new Contacts("371111","a.a@gmail.com","riga")),UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"), "11USD"));

        Vacancies.add(new Vacancy(UUID.fromString("ff4f9d8a-ab67-11ec-b909-0242ac120002"),"Mehanikis","sussy baka gay","https://api.time.com/wp-content/uploads/2021/02/laptop-home-office.jpg",
                new Contacts("371111","a.a@gmail.com","riga"),requirements,
                new Company(UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"),"NxtWork","IT","Good company",8.8,new Contacts("371111","a.a@gmail.com","riga")),UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"), "11USD"));

        Vacancies.add(new Vacancy(UUID.fromString("ff4fa032-ab67-11ec-b909-0242ac120002"),"Striptizeirs","sussy baka gay","https://www.theladders.com/wp-content/uploads/stress-work-191008-800x450.jpg",
                new Contacts("371111","a.a@gmail.com","riga"),requirements,
                new Company(UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"),"NxtWork","IT","Good company",8.8,new Contacts("371111","a.a@gmail.com","riga")),UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"), "11USD"));

        Vacancies.add(new Vacancy(UUID.fromString("ff4fa186-ab67-11ec-b909-0242ac120002"),"Barmanis","sussy baka gay","https://venterra.com/wp-content/uploads/2021/11/Burnout.jpg",
                new Contacts("371111","a.a@gmail.com","riga"),requirements,
                new Company(UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"),"NxtWork","IT","Good company",8.8,new Contacts("371111","a.a@gmail.com","riga")),UUID.fromString("7603923a-a887-11ec-b909-0242ac120002"), "11USD"));
        */
    }

    public List<Vacancy> getVacancies(){
        return Vacancies;
    }

    public Vacancy getVacancyById(UUID id) {
        for (Vacancy vac : Vacancies) {
            UUID vacId = vac.getId();
            if (vacId.equals(id)) {
                return vac;
            }
        }
        return null;
    }

    public List<VacancyDto> getIndexVacancies() {
        List<VacancyDto> vacancyDtoList = new ArrayList<>();
        List<PlatformVacancyDto> platformVacancyList = new ArrayList<>();
        List<CvLvVacancyDto> otherVacancyList = new ArrayList<>();

        // TODO: remove govno code
        for (Vacancy vacancy : Vacancies) {
            PlatformVacancyDto pvd = new PlatformVacancyDto();
            pvd.setTitle(vacancy.getTitle());
            pvd.setId(vacancy.getId());
            pvd.setDescription(vacancy.getDescription());

            Company company = companyService.getCompanyById(vacancy.getCompany_id());
            pvd.setCompany(company.getName());
            pvd.setSalary(vacancy.getSalary());
            pvd.setThumbnail_image(vacancy.getThumbnail_image());

            Contacts contacts = contactsService.getContactsById(vacancy.getContacts_id());
            pvd.setContacts(contacts);

            platformVacancyList.add(pvd);

            // currently pohuj about requirement
            //pvd.setRequirements();
        }

        // TODO: sussy code, review urgent
        for (CvLvVacancy vacancy : dataScraperCvLv.ParseFromCvLv()) {
            // possibility of work: 20%
            CvLvVacancyDto cvvd = new CvLvVacancyDto();
            cvvd.setTitle(vacancy.getName());
            cvvd.setCompany(vacancy.getCompany());
            cvvd.setSalary(vacancy.getSalary());

            Contacts contacts = new Contacts(UUID.randomUUID(), null, null, vacancy.getAddress());
            cvvd.setContacts(contacts);
            cvvd.setDue_date(vacancy.getDue_date());
            cvvd.setLink(vacancy.getLink());

            otherVacancyList.add(cvvd);
        }

        vacancyDtoList.addAll(platformVacancyList);
        vacancyDtoList.addAll(otherVacancyList);
        return vacancyDtoList;
    }
}
