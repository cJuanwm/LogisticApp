package com.example.LogisticApp.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.LogisticApp.models.entities.ZoneWarehouseEntity;
import com.example.LogisticApp.models.entities.dtos.ZoneWarehouseDTO;

@Mapper(componentModel = "spring")
public interface ZoneWarehouseMapper {

    ZoneWarehouseDTO zoneWarehouseConvertToDto(ZoneWarehouseEntity zoneWarehouse);
    ZoneWarehouseEntity zoneWarehouseConvertToEntity(ZoneWarehouseDTO zoneWarehouseDTO);
    List<ZoneWarehouseDTO> listZoneWarehouseConvertToDto(List<ZoneWarehouseEntity> zoneWarehouseEntityList);

}
