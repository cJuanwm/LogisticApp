package com.example.LogisticApp.mappers;

import com.example.LogisticApp.models.entities.ZoneWarehouseEntity;
import com.example.LogisticApp.models.entities.dtos.ZoneWarehouseDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-16T19:54:56-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.5 (Amazon.com Inc.)"
)
@Component
public class ZoneWarehouseMapperImpl implements ZoneWarehouseMapper {

    @Override
    public List<ZoneWarehouseDTO> listZoneWarehouseConvertToDto(List<ZoneWarehouseEntity> zoneWarehouseEntityList) {
        if ( zoneWarehouseEntityList == null ) {
            return null;
        }

        List<ZoneWarehouseDTO> list = new ArrayList<ZoneWarehouseDTO>( zoneWarehouseEntityList.size() );
        for ( ZoneWarehouseEntity zoneWarehouseEntity : zoneWarehouseEntityList ) {
            list.add( zoneWarehouseConvertToDto( zoneWarehouseEntity ) );
        }

        return list;
    }

    @Override
    public ZoneWarehouseDTO zoneWarehouseConvertToDto(ZoneWarehouseEntity zoneWarehouseEntity) {
        if ( zoneWarehouseEntity == null ) {
            return null;
        }

        ZoneWarehouseDTO zoneWarehouseDTO = new ZoneWarehouseDTO();

        zoneWarehouseDTO.setName( zoneWarehouseEntity.getName() );
        zoneWarehouseDTO.setMaxVolume( zoneWarehouseEntity.getMaxVolume() );
        zoneWarehouseDTO.setMaxWeight( zoneWarehouseEntity.getMaxWeight() );
        zoneWarehouseDTO.setOccupiedVolume( zoneWarehouseEntity.getOccupiedVolume() );
        zoneWarehouseDTO.setOccupiedWeight( zoneWarehouseEntity.getOccupiedWeight() );

        return zoneWarehouseDTO;
    }

    @Override
    public ZoneWarehouseEntity zoneWarehouseConvertToEntity(ZoneWarehouseDTO zoneWarehouseDTO) {
        if ( zoneWarehouseDTO == null ) {
            return null;
        }

        ZoneWarehouseEntity zoneWarehouseEntity = new ZoneWarehouseEntity();

        zoneWarehouseEntity.setName( zoneWarehouseDTO.getName() );
        zoneWarehouseEntity.setMaxVolume( zoneWarehouseDTO.getMaxVolume() );
        zoneWarehouseEntity.setMaxWeight( zoneWarehouseDTO.getMaxWeight() );
        zoneWarehouseEntity.setOccupiedVolume( zoneWarehouseDTO.getOccupiedVolume() );
        zoneWarehouseEntity.setOccupiedWeight( zoneWarehouseDTO.getOccupiedWeight() );

        return zoneWarehouseEntity;
    }
}
