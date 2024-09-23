package com.example.LogisticApp.services;

import com.example.LogisticApp.models.entities.dtos.MerchandiseDTO;

public interface MerchandiseService {

    MerchandiseDTO createMerchandise(MerchandiseDTO merchandiseDTO);

    MerchandiseDTO getMerchandise(int id);

    MerchandiseDTO updateMerchandise(int id, MerchandiseDTO merchandiseDTO);

    void deleteMerchandise(int id);

}
