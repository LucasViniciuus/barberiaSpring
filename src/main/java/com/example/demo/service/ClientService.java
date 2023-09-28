package com.example.demo.service;

import com.example.demo.entities.Client;
import com.example.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clienteRepository;

    public Client findClienteByName(String name) {
        return clienteRepository.findClienteByNameTeste(name);
    }
}
