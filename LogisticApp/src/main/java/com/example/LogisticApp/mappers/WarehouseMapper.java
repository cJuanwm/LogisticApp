package com.example.LogisticApp.mappers;

import org.mapstruct.Mapper;

import com.example.LogisticApp.models.entities.WarehouseEntity;
import com.example.LogisticApp.models.entities.dtos.WarehouseDTO;

@Mapper(componentModel = "spring")
public interface WarehouseMapper {

    WarehouseDTO warehouseConvertToDto(WarehouseEntity warehouseEntity);
    WarehouseEntity warehouseConvertToEntity(WarehouseDTO warehouseDTO);

}
