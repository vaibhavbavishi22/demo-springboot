package com.example.demo.dao.impl;

import com.example.demo.bo.Person;
import com.example.demo.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDaoImpl implements PersonDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Person> getListOfPeople(){

        return jdbcTemplate.query(
                "select * from employee",
                (rs, rowNum) ->
                        new Person(
                                rs.getInt("id"),
                                rs.getString("first_name")
                        )
        );
    }




}
