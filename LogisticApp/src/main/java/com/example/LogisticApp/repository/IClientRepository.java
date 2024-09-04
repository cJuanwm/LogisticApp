package com.example.LogisticApp.repository;

import com.example.LogisticApp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepository extends JpaRepository<Integer, Client> {



}
