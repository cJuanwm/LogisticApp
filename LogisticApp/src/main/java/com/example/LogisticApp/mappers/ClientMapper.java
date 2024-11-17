package com.example.LogisticApp.mappers;

import org.mapstruct.Mapper;

import com.example.LogisticApp.models.entities.ClientEntity;
import com.example.LogisticApp.models.entities.dtos.ClientDTO;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    ClientDTO clientConvertToDto(ClientEntity clientEntity);
    ClientEntity clientConvertToEntity(ClientDTO clientDTO);

}
