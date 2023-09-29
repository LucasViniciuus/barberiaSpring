package com.example.demo.service;

import com.example.demo.entities.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository clienteRepository;

    public Person findPersonByName(String name) {
        return clienteRepository.findPersonByNameTeste(name);
    }
}