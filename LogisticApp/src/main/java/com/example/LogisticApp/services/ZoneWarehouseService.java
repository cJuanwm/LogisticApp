package com.example.LogisticApp.services;

import java.util.List;

import com.example.LogisticApp.models.entities.dtos.ZoneWarehouseDTO;

public interface ZoneWarehouseService {

    ZoneWarehouseDTO createZoneWarehouse(ZoneWarehouseDTO zoneWarehouseDTO);

    ZoneWarehouseDTO getZoneWareHouse(int id);

    ZoneWarehouseDTO updateZoneWarehouse(int id, ZoneWarehouseDTO zoneWarehouseDTO);

    void deleteZoneWareHouse(int id);

    List<ZoneWarehouseDTO> getListZoneWarehouse();

}
