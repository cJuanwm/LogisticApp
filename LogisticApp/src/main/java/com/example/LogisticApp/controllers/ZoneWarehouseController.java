package com.example.LogisticApp.controllers;

import java.util.List;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.LogisticApp.models.entities.dtos.ZoneWarehouseDTO;
import com.example.LogisticApp.services.ZoneWarehouseService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api-zone-warehouse")
public class ZoneWarehouseController {

    private final ZoneWarehouseService zoneWarehouseService;

    @PostMapping("/zone-warehouse")
    public ResponseEntity<ZoneWarehouseDTO> createZoneWarehouse(@RequestBody ZoneWarehouseDTO zoneWarehouseDTO){
        ZoneWarehouseDTO zoneWarehouseCreated = zoneWarehouseService.createZoneWarehouse(zoneWarehouseDTO);
        return new ResponseEntity<>(zoneWarehouseCreated, HttpStatus.CREATED);
    }

    @GetMapping("/zone-warehouse/{id}")
    public ResponseEntity<ZoneWarehouseDTO> getZoneWarehouse(@PathVariable int id){
        ZoneWarehouseDTO zoneWarehouseGet = zoneWarehouseService.getZoneWareHouse(id);
        return new ResponseEntity<>(zoneWarehouseGet, HttpStatus.OK);
    }

    @GetMapping("/zone-warehouse/")
    public ResponseEntity<List<ZoneWarehouseDTO>> getZonesWarehouse(){
        List<ZoneWarehouseDTO> zonesWarehouseGet = zoneWarehouseService.getListZoneWarehouse();
        return new ResponseEntity<>(zonesWarehouseGet, HttpStatus.OK);
    }

    @PutMapping("/zone-warehouse/{id}")
    public ResponseEntity<ZoneWarehouseDTO> updateZoneWarehouse(@PathVariable int id, @RequestBody ZoneWarehouseDTO zoneWarehouseDTO){
        ZoneWarehouseDTO zoneWarehouseUpdated = zoneWarehouseService.updateZoneWarehouse(id, zoneWarehouseDTO);
        return new ResponseEntity<>(zoneWarehouseUpdated, HttpStatus.OK);
    }

    @DeleteMapping("/zone-warehouse/{id}")
    public ResponseEntity<Void> deleteZoneWarehouse(@PathVariable int id){
        zoneWarehouseService.deleteZoneWareHouse(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
