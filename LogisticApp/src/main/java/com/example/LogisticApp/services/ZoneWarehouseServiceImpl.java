package com.example.LogisticApp.services;

import java.util.List;

import jakarta.transaction.Transactional;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import com.example.LogisticApp.mappers.ZoneWarehouseMapper;
import com.example.LogisticApp.models.entities.ZoneWarehouseEntity;
import com.example.LogisticApp.models.entities.dtos.ZoneWarehouseDTO;
import com.example.LogisticApp.repositories.ZoneWareHouseRepository;

@RequiredArgsConstructor
@Service
public class ZoneWarehouseServiceImpl implements ZoneWarehouseService{

    private final ZoneWareHouseRepository zoneWareHouseRepository;

    private final ZoneWarehouseMapper zoneWarehouseMapper;

    @Override
    public ZoneWarehouseDTO createZoneWarehouse(ZoneWarehouseDTO zoneWarehouseDTO) {
        ZoneWarehouseEntity zoneWarehouseToCreate = zoneWarehouseMapper.zoneWarehouseConvertToEntity(zoneWarehouseDTO);
        zoneWareHouseRepository.save(zoneWarehouseToCreate);
        return zoneWarehouseMapper.zoneWarehouseConvertToDto(zoneWarehouseToCreate);
    }

    @Override
    public ZoneWarehouseDTO getZoneWareHouse(int id) {
        ZoneWarehouseEntity zoneWarehouseToGet = zoneWareHouseRepository.findById(id);
        return zoneWarehouseMapper.zoneWarehouseConvertToDto(zoneWarehouseToGet);
    }

    @Override
    public List<ZoneWarehouseDTO> getListZoneWarehouse(){
        List<ZoneWarehouseEntity> zoneWarehouseEntities = zoneWareHouseRepository.findAll();
        return zoneWarehouseMapper.listZoneWarehouseConvertToDto(zoneWarehouseEntities);
    }

    @Override
    public ZoneWarehouseDTO updateZoneWarehouse(int id, ZoneWarehouseDTO zoneWarehouseDTO) {
        ZoneWarehouseEntity zoneWarehouseToUpdate = zoneWareHouseRepository.findById(id);

        zoneWarehouseToUpdate.setName(zoneWarehouseDTO.getName());
        zoneWarehouseToUpdate.setMaxVolume(zoneWarehouseDTO.getMaxVolume());
        zoneWarehouseToUpdate.setMaxWeight(zoneWarehouseDTO.getMaxWeight());
        zoneWarehouseToUpdate.setOccupiedVolume(zoneWarehouseDTO.getOccupiedVolume());
        zoneWarehouseToUpdate.setOccupiedWeight(zoneWarehouseDTO.getOccupiedWeight());

        zoneWareHouseRepository.save(zoneWarehouseToUpdate);

        return zoneWarehouseMapper.zoneWarehouseConvertToDto(zoneWarehouseToUpdate);
    }

    @Transactional
    @Override
    public void deleteZoneWareHouse(int id) {
        zoneWareHouseRepository.deleteById(id);
    }

}
