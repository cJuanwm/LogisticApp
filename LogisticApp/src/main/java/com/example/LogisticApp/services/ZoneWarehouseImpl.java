package com.example.LogisticApp.services;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LogisticApp.mappers.ZoneWarehouseMapper;
import com.example.LogisticApp.models.entities.ZoneWarehouseEntity;
import com.example.LogisticApp.models.entities.dtos.ZoneWarehouseDTO;
import com.example.LogisticApp.repositories.ZoneWareHouseRepository;

@Service
public class ZoneWarehouseImpl implements ZoneWarehouseService{

    @Autowired
    private ZoneWareHouseRepository zoneWareHouseRepository;

    @Autowired
    private ZoneWarehouseMapper zoneWarehouseMapper;

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
