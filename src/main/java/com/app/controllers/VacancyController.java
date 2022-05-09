package com.app.controllers;

import com.app.model.CvVacancy.CvLvVacancy;
import com.app.model.jobs.Vacancy;
import com.app.services.DataScraperCvLv;
import com.app.services.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class VacancyController {

    @Autowired
    private VacancyService vacancyService;

    @Autowired
    private DataScraperCvLv dataScraperCvLv;

    @GetMapping("/getVacancies")
    public List<Vacancy> getVacancies(){
        try {
            //vacancyService.test();
            return vacancyService.getVacancies();
            //return vacancyService.test();
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/getScraped")
    public List<CvLvVacancy> getScrapedVacancies(){
        List<CvLvVacancy> test = dataScraperCvLv.ParseFromCvLv();
        System.out.println(test.size());
        try {
            //vacancyService.test();
            return dataScraperCvLv.ParseFromCvLv();

            //return vacancyService.test();
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/getVacancies/{id}")
    public Vacancy getVacancyById(@PathVariable("id") String id)
    {
        try {
            return vacancyService.getVacancyById(UUID.fromString(id));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
