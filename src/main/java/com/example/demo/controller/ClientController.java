package com.example.demo.controller;

import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/clients")
@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/hello")
    public String getClients() {
        try {
            return clientService.findClienteByName("Teste").toString();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
