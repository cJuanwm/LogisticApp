package com.example.LogisticApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.LogisticApp.models.entities.ZoneWarehouseEntity;

@Repository
public interface ZoneWareHouseRepository extends JpaRepository<ZoneWarehouseEntity, Integer> {

    //Se sobre escribe metodo ya que el por defecto me retorna optional y no lo considero necesario.
    ZoneWarehouseEntity findById(int id);

}
