package com.example.LogisticApp.services;

import com.example.LogisticApp.helpers.validations.ClientValidationImpl;
import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LogisticApp.mappers.ClientMapper;
import com.example.LogisticApp.models.entities.ClientEntity;
import com.example.LogisticApp.models.entities.dtos.ClientDTO;
import com.example.LogisticApp.repositories.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientMapper clientMapper;

    @Autowired
    private ClientValidationImpl clientValidation;

    @Override
    public ClientDTO createClient(ClientDTO clientDTO) {
        clientValidation.validateClientData(clientDTO);

        ClientEntity clientToCreate = clientMapper.clientConvertToEntity(clientDTO);
        ClientEntity clientSaved = clientRepository.save(clientToCreate);
        return clientMapper.clientConvertToDto(clientSaved);
    }

    @Override
    public ClientDTO getClient(String document) {
        clientValidation.validateDocument(document);
        ClientEntity clientToGet = clientRepository.findByDocument(document);
        return clientMapper.clientConvertToDto(clientToGet);
    }

    @Override
    public ClientDTO updateClient(String document, ClientDTO clientDTO) {
        ClientEntity clientToEdit = clientRepository.findByDocument(document);

        clientValidation.validateClientData(clientDTO);

        clientToEdit.setName(clientDTO.getName());
        clientToEdit.setDepartment(clientDTO.getDepartment());
        clientToEdit.setMunicipality(clientDTO.getMunicipality());
        clientToEdit.setAddress(clientDTO.getAddress());
        clientToEdit.setZipCode(clientDTO.getZipCode());
        clientToEdit.setRol(clientDTO.getRol());
        clientToEdit.setEmail(clientDTO.getEmail());
        clientToEdit.setPhone(clientDTO.getPhone());

        clientRepository.save(clientToEdit);

        return clientMapper.clientConvertToDto(clientToEdit);
    }

    @Transactional
    @Override
    public void deleteClient(String document) {
        clientValidation.validateDocument(document);
        clientRepository.deleteByDocument(document);
    }

}
