package com.ohashi.personmanager.services.impl;

import com.ohashi.personmanager.entities.Client;
import com.ohashi.personmanager.repositories.ClientRepository;
import com.ohashi.personmanager.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client createClient(Client newClient) {
        var createdClient = this.clientRepository.save(newClient);

        return createdClient;
    }
}
