package com.example.demo.controller;

import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/persons")
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/hello")
    public String getPerson() {
        try {
            return personService.findPersonByName("Teste").toString();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
