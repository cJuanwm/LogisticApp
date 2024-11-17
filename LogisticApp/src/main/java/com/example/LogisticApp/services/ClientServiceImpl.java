package com.example.LogisticApp.services;

import jakarta.transaction.Transactional;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import com.example.LogisticApp.mappers.ClientMapper;
import com.example.LogisticApp.helpers.validations.ClientValidationImpl;
import com.example.LogisticApp.models.entities.ClientEntity;
import com.example.LogisticApp.models.entities.dtos.ClientDTO;
import com.example.LogisticApp.repositories.ClientRepository;

@RequiredArgsConstructor
@Service
public class ClientServiceImpl implements ClientService{

    private final ClientRepository clientRepository;

    private final ClientMapper clientMapper;

    private final ClientValidationImpl clientValidation;

    @Override
    public ClientDTO createClient(ClientDTO clientDTO) {
        clientValidation.validateClientData(clientDTO);

        ClientEntity clientExistence = clientRepository.findByDocument(clientDTO.getDocument());

        clientValidation.validateClientExistence(clientDTO, clientExistence);

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
