package com.example.LogisticApp.mappers;

import com.example.LogisticApp.models.entities.ClientEntity;
import com.example.LogisticApp.models.entities.dtos.ClientDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-23T10:24:19-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.4 (Amazon.com Inc.)"
)
@Component
public class ClientMapperImpl implements ClientMapper {

    @Override
    public ClientDTO clientConvertToDto(ClientEntity clientEntity) {
        if ( clientEntity == null ) {
            return null;
        }

        ClientDTO clientDTO = new ClientDTO();

        return clientDTO;
    }

    @Override
    public ClientEntity clientConvertToEntity(ClientDTO clientDTO) {
        if ( clientDTO == null ) {
            return null;
        }

        ClientEntity clientEntity = new ClientEntity();

        return clientEntity;
    }
}
