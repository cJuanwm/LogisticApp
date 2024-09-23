package com.example.LogisticApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.LogisticApp.models.entities.dtos.MerchandiseDTO;
import com.example.LogisticApp.services.MerchandiseService;


@RestController
@RequestMapping("/api-merchandise")
public class MerchandiseController {

    @Autowired
    MerchandiseService merchandiseService;

    @PostMapping("/merchandise")
    public ResponseEntity<MerchandiseDTO> createMerchandise(@RequestBody MerchandiseDTO merchandiseDTO){
        MerchandiseDTO merchandiseCreated = merchandiseService.createMerchandise(merchandiseDTO);
        return new ResponseEntity<>(merchandiseCreated, HttpStatus.CREATED);
    }

    @GetMapping("/merchandise/{id}")
    public ResponseEntity<MerchandiseDTO> getMerchandise(@PathVariable int id){
        MerchandiseDTO merchandiseGet = merchandiseService.getMerchandise(id);
        return new ResponseEntity<>(merchandiseGet, HttpStatus.OK);
    }

    @PutMapping("/merchandise/{id}")
    public ResponseEntity<MerchandiseDTO> updateMerchandise(@PathVariable int id, @RequestBody MerchandiseDTO merchandiseDTO){
        MerchandiseDTO merchandiseUpdated = merchandiseService.updateMerchandise(id, merchandiseDTO);
        return new ResponseEntity<>(merchandiseUpdated, HttpStatus.OK);
    }

    @DeleteMapping("/merchandise/{id}")
    public ResponseEntity<Void> deleteMerchandise(@PathVariable int id){
        merchandiseService.deleteMerchandise(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
