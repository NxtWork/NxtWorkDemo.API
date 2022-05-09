package com.app.services;

import com.app.model.CvVacancy.CvLvVacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DataScraperCvLv {
    public List<CvLvVacancy> ParseFromCvLv() {

        List<CvLvVacancy> vacancies = new ArrayList<>();
        for(int limit = 0; limit<200; limit+=20) {
            try {

                Document doc = Jsoup.connect("https://cv.lv/lv/search?limit=20&offset="+limit+"&isHourlySalary=false").get();
                Elements vacanciesScraped = doc.getElementsByClass("vacancies-list");

                for (Element vac : vacanciesScraped.select("li")) {
                    CvLvVacancy vacancy = new CvLvVacancy();
                    vacancy.setName(vac.getElementsByClass("vacancy-item__title").text());
                    String spanText = vac.getElementsByClass("hide-mobile").text();
                    vacancy.setCompany(vac.getElementsByClass("vacancy-item__body").text().substring(spanText.length() - 2,
                            vac.getElementsByClass("vacancy-item__body").text().length() - 1 - vac.getElementsByClass("vacancy-item__locations").text().length() - vac.getElementsByClass("vacancy-item__refugees").text().length()));
                    vacancy.setAddress(vac.getElementsByClass("vacancy-item__locations").text());
                    vacancy.setSalary(vac.getElementsByClass("vacancy-item__salary-label").text());
                    vacancy.setDue_date(vac.getElementsByClass("vacancy-item__expiry").text());
                    vacancy.setLink("cv.lv" + vac.select("li.vacancies-list__item a").attr("href"));
                    vacancies.add(vacancy);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
            return vacancies;

    }
}
