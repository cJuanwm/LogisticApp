package com.example.LogisticApp.services;

import com.example.LogisticApp.models.entities.dtos.WarehouseDTO;

public interface WarehouseService {

    WarehouseDTO createWarehouse(WarehouseDTO wareHouseDTO);

    WarehouseDTO getWarehouse(int id);

    WarehouseDTO updateWarehouse(int id, WarehouseDTO wareHouseDTO);

    void deleteWarehouse(int id);

}
