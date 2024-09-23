package com.example.LogisticApp.services;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LogisticApp.mappers.WarehouseMapper;
import com.example.LogisticApp.models.entities.WarehouseEntity;
import com.example.LogisticApp.models.entities.dtos.WarehouseDTO;
import com.example.LogisticApp.repositories.WarehouseRepository;

@Service
public class WarehouseServiceImpl implements WarehouseService{

    @Autowired
    private WarehouseRepository warehouseRepository;

    @Autowired
    private WarehouseMapper wareHouseMapper;

    @Override
    public WarehouseDTO createWarehouse(WarehouseDTO wareHouseDTO) {
        WarehouseEntity warehouseToCreate = wareHouseMapper.wareHouseConvertToEntity(wareHouseDTO);
        warehouseRepository.save(warehouseToCreate);
        return wareHouseMapper.wareHouseConvertToDto(warehouseToCreate);
    }

    @Override
    public WarehouseDTO getWarehouse(int id) {
        WarehouseEntity warehouseToGet = warehouseRepository.findById(id);
        return wareHouseMapper.wareHouseConvertToDto(warehouseToGet);
    }

    @Override
    public WarehouseDTO updateWarehouse(int id, WarehouseDTO wareHouseDTO) {
        WarehouseEntity warehouseToUpdate = warehouseRepository.findById(id);

        warehouseToUpdate.setName(wareHouseDTO.getName());
        warehouseToUpdate.setDepartment(wareHouseDTO.getDepartment());
        warehouseToUpdate.setMunicipality(wareHouseDTO.getMunicipality());
        warehouseToUpdate.setAddress(wareHouseDTO.getAddress());
        warehouseToUpdate.setInstalledVolumeCapacity(wareHouseDTO.getInstalledVolumeCapacity());

        warehouseRepository.save(warehouseToUpdate);

        return wareHouseMapper.wareHouseConvertToDto(warehouseToUpdate);
    }

    @Transactional
    @Override
    public void deleteWarehouse(int id) {
        warehouseRepository.deleteById(id);
    }

}
