package com.example.LogisticApp.mappers;

import org.springframework.stereotype.Component;

import com.example.LogisticApp.models.entities.WarehouseEntity;
import com.example.LogisticApp.models.entities.dtos.WarehouseDTO;

@Component
public class WarehouseMapper {

    public WarehouseDTO wareHouseConvertToDto(WarehouseEntity warehouseEntity){
        return new WarehouseDTO(warehouseEntity.getName(), warehouseEntity.getDepartment(), warehouseEntity.getMunicipality(), warehouseEntity.getAddress(),
                warehouseEntity.getInstalledVolumeCapacity());
    }

    public WarehouseEntity wareHouseConvertToEntity(WarehouseDTO wareHouseDTO){
        WarehouseEntity warehouseEntity = new WarehouseEntity();

        warehouseEntity.setName(wareHouseDTO.getName());
        warehouseEntity.setDepartment(wareHouseDTO.getDepartment());
        warehouseEntity.setMunicipality(wareHouseDTO.getMunicipality());
        warehouseEntity.setAddress(wareHouseDTO.getAddress());
        warehouseEntity.setInstalledVolumeCapacity(wareHouseDTO.getInstalledVolumeCapacity());

        return warehouseEntity;
    }

}
