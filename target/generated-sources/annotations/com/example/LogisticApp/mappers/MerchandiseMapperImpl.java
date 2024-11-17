package com.example.LogisticApp.mappers;

import com.example.LogisticApp.models.entities.MerchandiseEntity;
import com.example.LogisticApp.models.entities.dtos.MerchandiseDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-16T19:53:57-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.5 (Amazon.com Inc.)"
)
@Component
public class MerchandiseMapperImpl implements MerchandiseMapper {

    @Override
    public MerchandiseDTO merchandiseConvertToDto(MerchandiseEntity merchandiseEntity) {
        if ( merchandiseEntity == null ) {
            return null;
        }

        MerchandiseDTO merchandiseDTO = new MerchandiseDTO();

        return merchandiseDTO;
    }

    @Override
    public MerchandiseEntity merchandiseConvertToEntity(MerchandiseDTO merchandiseDTO) {
        if ( merchandiseDTO == null ) {
            return null;
        }

        MerchandiseEntity merchandiseEntity = new MerchandiseEntity();

        return merchandiseEntity;
    }
}
