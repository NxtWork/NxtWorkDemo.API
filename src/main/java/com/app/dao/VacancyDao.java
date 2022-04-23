package com.app.dao;

import com.app.model.common.Contacts;
import com.app.model.jobs.Vacancy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

@Repository
public class VacancyDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Vacancy> vacancies() {
        RowMapper<Vacancy> rowMapper = (rs, rowNumber) -> mapVacancy(rs);
        return jdbcTemplate.query("SELECT * FROM vacancy", rowMapper);
    }

    public Vacancy mapVacancy(ResultSet rs) throws SQLException {
    Vacancy vacancy = new Vacancy();

        vacancy.setId(UUID.fromString(rs.getString("id")));
        vacancy.setTitle(rs.getString("title"));
        vacancy.setDescription(rs.getString("description"));
        vacancy.setThumbnail_image(rs.getString("thumbnail_image"));

        ResultSet contacts = rs.getArray("contacts").getResultSet();

        Contacts contacts1 = new Contacts(contacts.getString(0), contacts.getString(1),
                contacts.getString(2));

        vacancy.setContacts(contacts1);

        //ResultSet requirements = rs.getArray("requirements").getResultSet();

        return vacancy;

    }

    public List<Vacancy> getVacancy() {  //в первую переменную(rs) всю запись, во вторую порядковый номер(rowNumber), название переменных неважно
        RowMapper<Vacancy> rowMapper = (rs, rowNumber) -> mapVacancy(rs);
        return jdbcTemplate.query("SELECT * FROM vacancy", rowMapper);    //query - шлет запрос в базу данных и делает что то с данными
    }

}
