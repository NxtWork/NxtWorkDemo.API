package com.app.controllers;

import com.app.model.jobs.Vacancy;
import com.app.services.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class VacancyController {

    @Autowired
    private VacancyService vacancyService;


    @GetMapping("/getVacancies")
    public List<Vacancy> getVacancies(){
        try {
            vacancyService.test();
            //return vacancyService.getVacancies();
            return vacancyService.test();
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
