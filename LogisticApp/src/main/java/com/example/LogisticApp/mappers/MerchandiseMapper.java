package com.example.LogisticApp.mappers;

import org.mapstruct.Mapper;

import com.example.LogisticApp.models.entities.MerchandiseEntity;
import com.example.LogisticApp.models.entities.dtos.MerchandiseDTO;

@Mapper(componentModel = "spring")
public interface MerchandiseMapper {

    MerchandiseDTO merchandiseConvertToDto(MerchandiseEntity merchandiseEntity);
    MerchandiseEntity merchandiseConvertToEntity(MerchandiseDTO merchandiseDTO);

}
