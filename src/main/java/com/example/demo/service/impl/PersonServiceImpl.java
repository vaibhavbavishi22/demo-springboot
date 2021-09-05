package com.example.demo.service.impl;

import com.example.demo.bo.Person;
import com.example.demo.dao.PersonDao;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDao personDao;

    @Override
    public List<Person> getListOfPerson(){
        List<Person> personList = personDao.getListOfPeople();
        return personList;
    }


}
