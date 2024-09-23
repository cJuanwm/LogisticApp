package com.example.LogisticApp.controllers;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.LogisticApp.models.entities.dtos.ClientDTO;
import com.example.LogisticApp.services.ClientService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api-client")
public class ClientController {

    private final ClientService clientService;

    @PostMapping("/client")
    ResponseEntity<ClientDTO> createClient(@RequestBody ClientDTO clientDTO){
        ClientDTO clientCreated = clientService.createClient(clientDTO);
        return new ResponseEntity<>(clientCreated, HttpStatus.CREATED);
    }

    @PutMapping("/client/{document}")
    ResponseEntity<ClientDTO> updateClient(@PathVariable String document, @RequestBody ClientDTO clientDTO){
        ClientDTO clientUpdated = clientService.updateClient(document, clientDTO);
        return new ResponseEntity<>(clientUpdated, HttpStatus.OK);
    }

    @GetMapping("/client/{document}")
    ResponseEntity<ClientDTO> getClient(@PathVariable String document){
        ClientDTO clientGet = clientService.getClient(document);
        return new ResponseEntity<>(clientGet, HttpStatus.OK);
    }

    @DeleteMapping("/client/{document}")
    ResponseEntity<Void> deleteClient(@PathVariable String document){
        clientService.deleteClient(document);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
