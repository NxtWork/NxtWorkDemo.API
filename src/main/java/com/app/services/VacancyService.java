package com.app.services;

import com.app.dao.VacancyDao;
import com.app.model.jobs.Company;
import com.app.model.common.Contacts;
import com.app.model.jobs.Requirement;
import com.app.model.jobs.Vacancy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class VacancyService {

    @Autowired
    private VacancyDao vacancyDao;

    private List<Vacancy> Vacancies;
    private List<Company> Companies;
    private List<Requirement> requirements;

    public VacancyService() {

        requirements = new ArrayList<Requirement>();

        requirements.add(new Requirement("English","B2"));
        requirements.add(new Requirement("Driving lessons","true"));
        requirements.add(new Requirement("Mathematics","10"));

        Vacancies = new ArrayList<Vacancy>();
        Vacancies.add(new Vacancy(UUID.randomUUID(),"Apkopējs","gribu stradat","https://www.iamexpat.nl/sites/default/files/styles/ogimage_thumb/public/cleaners-house-cleaning-services-netherlands_8.jpg",
                new Contacts("371111","a.a@gmail.com","riga"),requirements,
                new Company(UUID.randomUUID(),"NxtWork","IT","Good company",8.8,new Contacts("371111","a.a@gmail.com","riga")),UUID.randomUUID(), "5$"));

        Vacancies.add(new Vacancy(UUID.randomUUID(),"Teacher","work hard","https://www.drupal.org/files/project-images/cleaner-logo.png",
                new Contacts("371111","a.a@gmail.com","riga"),requirements,
                new Company(UUID.randomUUID(),"NxtWork","IT","Good company",8.8,new Contacts("371111","a.a@gmail.com","riga")),UUID.randomUUID(), "14LT"));

        Vacancies.add(new Vacancy(UUID.randomUUID(),"IT Manager","dont work","https://www.premiumclean.co.nz/wp-content/uploads/lady_cleaner_prof-min.png",
                new Contacts("371111","a.a@gmail.com","riga"),requirements,
                new Company(UUID.randomUUID(),"NxtWork","IT","Good company",8.8,new Contacts("371111","a.a@gmail.com","riga")),UUID.randomUUID(), "11USD"));

        Vacancies.add(new Vacancy(UUID.randomUUID(),"Teacher","teach me","https://www.premiumclean.co.nz/wp-content/uploads/lady_cleaner_prof-min.png",
                new Contacts("371111","a.a@gmail.com","riga"),requirements,
                new Company(UUID.randomUUID(),"NxtWork","IT","Good company",8.8,new Contacts("371111","teacher.a@gmail.com","riga")),UUID.randomUUID(), "11USD"));

        Vacancies.add(new Vacancy(UUID.randomUUID(),"Director","money","https://www.premiumclean.co.nz/wp-content/uploads/lady_cleaner_prof-min.png",
                new Contacts("371111","a.a@gmail.com","riga"),requirements,
                new Company(UUID.randomUUID(),"NxtWork","IT","Good company",8.8,new Contacts("371111","director.a@gmail.com","riga")),UUID.randomUUID(), "11USD"));


    }

    public List<Vacancy> getVacancies(){
        return Vacancies;
    }

    public List<Vacancy> test() {
        return vacancyDao.getVacancy();
    }
}
