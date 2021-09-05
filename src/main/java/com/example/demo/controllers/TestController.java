package com.example.demo.controllers;

import com.example.demo.bo.PersonRequest;
import com.example.demo.service.PersonService;
import com.example.demo.service.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/test")
public class TestController {

    @Value("${version}")
    private String version;

    @Autowired
    @Qualifier("2")
    private Test test;

    @Autowired
    PersonService personService;

    @GetMapping(value="/getName/{animal}", produces = MediaType.TEXT_HTML_VALUE)
    public String getName(@PathVariable String animal, @RequestParam String color){
        personService.getListOfPerson();
        String s = test.sendPrint(animal);
        return "You got the job" +animal +version;
    }

    @PostMapping(value="/getPersons", consumes=MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public Object getPersons(@RequestBody PersonRequest personRequest){
        int i = 60;
        return "";
    }
}
