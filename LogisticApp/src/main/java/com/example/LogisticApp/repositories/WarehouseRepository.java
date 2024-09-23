package com.example.LogisticApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.LogisticApp.models.entities.WarehouseEntity;

@Repository
public interface WarehouseRepository extends JpaRepository<WarehouseEntity, Integer> {

    //Se sobre escribe metodo ya que el por defecto me retorna optional y no lo considero necesario.
    WarehouseEntity findById(int id);

}
