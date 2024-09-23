package com.example.LogisticApp.services;

import com.example.LogisticApp.models.entities.dtos.ClientDTO;

public interface ClientService {

    ClientDTO createClient(ClientDTO clientDTO);

    ClientDTO getClient(String document);

    ClientDTO updateClient(String document, ClientDTO clientDTO);

    void deleteClient(String document);

}
