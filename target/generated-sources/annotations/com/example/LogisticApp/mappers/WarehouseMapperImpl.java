package com.example.LogisticApp.mappers;

import com.example.LogisticApp.models.entities.WarehouseEntity;
import com.example.LogisticApp.models.entities.dtos.WarehouseDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-23T10:32:29-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.4 (Amazon.com Inc.)"
)
@Component
public class WarehouseMapperImpl implements WarehouseMapper {

    @Override
    public WarehouseDTO warehouseConvertToDto(WarehouseEntity warehouseEntity) {
        if ( warehouseEntity == null ) {
            return null;
        }

        WarehouseDTO warehouseDTO = new WarehouseDTO();

        warehouseDTO.setName( warehouseEntity.getName() );
        warehouseDTO.setDepartment( warehouseEntity.getDepartment() );
        warehouseDTO.setMunicipality( warehouseEntity.getMunicipality() );
        warehouseDTO.setAddress( warehouseEntity.getAddress() );
        warehouseDTO.setInstalledVolumeCapacity( warehouseEntity.getInstalledVolumeCapacity() );

        return warehouseDTO;
    }

    @Override
    public WarehouseEntity warehouseConvertToEntity(WarehouseDTO warehouseDTO) {
        if ( warehouseDTO == null ) {
            return null;
        }

        WarehouseEntity warehouseEntity = new WarehouseEntity();

        warehouseEntity.setName( warehouseDTO.getName() );
        warehouseEntity.setDepartment( warehouseDTO.getDepartment() );
        warehouseEntity.setMunicipality( warehouseDTO.getMunicipality() );
        warehouseEntity.setAddress( warehouseDTO.getAddress() );
        warehouseEntity.setInstalledVolumeCapacity( warehouseDTO.getInstalledVolumeCapacity() );

        return warehouseEntity;
    }
}
