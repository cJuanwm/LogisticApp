package com.example.LogisticApp.controllers;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.LogisticApp.models.entities.dtos.WarehouseDTO;
import com.example.LogisticApp.services.WarehouseService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api-warehouse")
public class WarehouseController {

    private final WarehouseService warehouseService;

    @PostMapping("/warehouse")
    public ResponseEntity<WarehouseDTO> createWarehouse(@RequestBody WarehouseDTO wareHouseDTO){
        WarehouseDTO warehouseCreated = warehouseService.createWarehouse(wareHouseDTO);
        return new ResponseEntity<>(warehouseCreated, HttpStatus.CREATED);
    }

    @GetMapping("/warehouse/{id}")
    public ResponseEntity<WarehouseDTO> getWarehouse(@PathVariable int id){
        WarehouseDTO warehouseGet = warehouseService.getWarehouse(id);
        return new ResponseEntity<>(warehouseGet, HttpStatus.OK);
    }

    @PutMapping("/warehouse/{id}")
    public ResponseEntity<WarehouseDTO> updateWarehouse(@PathVariable int id, @RequestBody WarehouseDTO warehouseDTO){
        WarehouseDTO warehouseUpdated = warehouseService.updateWarehouse(id, warehouseDTO);
        return new ResponseEntity<>(warehouseUpdated, HttpStatus.OK);
    }

    @DeleteMapping("/warehouse/{id}")
    public ResponseEntity<Void> deleteWarehouse(@PathVariable int id){
        warehouseService.deleteWarehouse(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
