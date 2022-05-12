package com.app.controllers;

import com.app.model.jobs.Vacancy;
import com.app.services.DataScraperCvLv;
import com.app.services.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/vacancies")
public class VacancyController {
    @Autowired
    private VacancyService vacancyService;

    @Autowired
    private DataScraperCvLv dataScraperCvLv;

    @GetMapping
    public String vacancies(Model model) {
        // model.addAttribute("vacancyList", vacancyService.getVacancies());
        model.addAttribute("vacancyList", vacancyService.getIndexVacancies());
        return "vacancies";
    }
}
