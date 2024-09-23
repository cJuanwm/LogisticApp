package com.example.LogisticApp.mappers;

import org.springframework.stereotype.Component;

import com.example.LogisticApp.models.entities.ClientEntity;
import com.example.LogisticApp.models.entities.dtos.ClientDTO;

@Component
public class ClientMapper {

    public ClientDTO clientConvertToDto(ClientEntity clientEntity){
        return new ClientDTO(clientEntity.getDocument(), clientEntity.getName(), clientEntity.getDepartment(), clientEntity.getMunicipality(),
                clientEntity.getAddress(), clientEntity.getZipCode(), clientEntity.getRol(), clientEntity.getEmail(), clientEntity.getPhone());
    }

    public ClientEntity clientConvertToEntity(ClientDTO clientDTO){
        ClientEntity clientEntity = new ClientEntity();

        clientEntity.setDocument(clientDTO.getDocument());
        clientEntity.setName(clientDTO.getName());
        clientEntity.setDepartment(clientDTO.getDepartment());
        clientEntity.setMunicipality(clientDTO.getMunicipality());
        clientEntity.setAddress(clientDTO.getAddress());
        clientEntity.setZipCode(clientDTO.getZipCode());
        clientEntity.setRol(clientDTO.getRol());
        clientEntity.setEmail(clientDTO.getEmail());
        clientEntity.setPhone(clientDTO.getPhone());

        return clientEntity;
    }

}