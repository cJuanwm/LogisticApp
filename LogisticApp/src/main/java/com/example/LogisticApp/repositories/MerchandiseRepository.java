package com.example.LogisticApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.LogisticApp.models.entities.MerchandiseEntity;

@Repository
public interface MerchandiseRepository extends JpaRepository<MerchandiseEntity, Integer> {

    //Se sobre escribe metodo ya que el por defecto me retorna optional y no lo considero necesario.
    MerchandiseEntity findById(int id);

}
