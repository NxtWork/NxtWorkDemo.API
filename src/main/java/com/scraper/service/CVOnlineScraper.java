package com.scraper.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.scraper.model.CvVacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class CVOnlineScraper {
    public List<CvVacancy> ParseFromPage(String pageUrl) {
        try {
            Document doc = Jsoup.connect(pageUrl).get();
            Elements vacanciesScraped = doc.getElementsByClass("vacancy-item");

            List<CvVacancy> vacancies = new ArrayList<>();
            for (Element vac : vacanciesScraped) {
                CvVacancy vacancy = new CvVacancy();
                vacancy.setName(vac.getElementsByClass("vacancy-item__title").text());
                vacancy.setCompany(vac.getElementsByClass("vacancy-item__company").text());
                vacancy.setAddress(vac.getElementsByClass("vacancy-item__locations").text());
                vacancy.setSalary(vac.getElementsByClass("vacancy-item__salary-label").text());
                vacancy.setDue_date(vac.getElementsByClass("vacancy-item__expiry").text());
                vacancies.add(vacancy);
            }
            return vacancies;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
