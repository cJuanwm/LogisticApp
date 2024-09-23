package com.example.LogisticApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.LogisticApp.models.entities.ClientEntity;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {

    ClientEntity findByDocument(String document);

    void deleteByDocument(String document);

}
