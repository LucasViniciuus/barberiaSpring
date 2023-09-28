package com.example.demo.controller;

import com.example.demo.service.AddressService;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/address")
@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping()
    public String getAdress() {
        try {
            return addressService.findAddressesByCity("Cityville").toString();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
