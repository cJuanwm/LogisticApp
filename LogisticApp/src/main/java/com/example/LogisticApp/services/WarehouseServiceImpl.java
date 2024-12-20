package com.example.LogisticApp.services;

import jakarta.transaction.Transactional;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import com.example.LogisticApp.mappers.WarehouseMapper;
import com.example.LogisticApp.models.entities.WarehouseEntity;
import com.example.LogisticApp.models.entities.dtos.WarehouseDTO;
import com.example.LogisticApp.repositories.WarehouseRepository;

@RequiredArgsConstructor
@Service
public class WarehouseServiceImpl implements WarehouseService{

    private final WarehouseRepository warehouseRepository;

    private final WarehouseMapper warehouseMapper;

    @Override
    public WarehouseDTO createWarehouse(WarehouseDTO wareHouseDTO) {
        WarehouseEntity warehouseToCreate = warehouseMapper.warehouseConvertToEntity(wareHouseDTO);
        warehouseRepository.save(warehouseToCreate);
        return warehouseMapper.warehouseConvertToDto(warehouseToCreate);
    }

    @Override
    public WarehouseDTO getWarehouse(int id) {
        WarehouseEntity warehouseToGet = warehouseRepository.findById(id);
        return warehouseMapper.warehouseConvertToDto(warehouseToGet);
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

        return warehouseMapper.warehouseConvertToDto(warehouseToUpdate);
    }

    @Transactional
    @Override
    public void deleteWarehouse(int id) {
        warehouseRepository.deleteById(id);
    }

}
