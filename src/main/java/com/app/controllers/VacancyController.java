package com.app.controllers;

import com.app.model.Vacancy;
import com.app.services.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VacancyController {

    @Autowired
    private VacancyService vacancyService;


    @GetMapping("/getVacancies")
    public List<Vacancy> getVacancies(){
        try {
            return vacancyService.getVacancies();
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
