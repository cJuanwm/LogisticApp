package com.example.LogisticApp.mappers;

import org.springframework.stereotype.Component;

import com.example.LogisticApp.models.entities.MerchandiseEntity;
import com.example.LogisticApp.models.entities.dtos.MerchandiseDTO;

@Component
public class MerchandiseMapper {

    public MerchandiseDTO merchandiseConvertToDto(MerchandiseEntity merchandiseEntity){
        return new MerchandiseDTO(merchandiseEntity.getVolumeOccupies(), merchandiseEntity.getWeightOccupies(), merchandiseEntity.getName(),
                merchandiseEntity.getDescription(), merchandiseEntity.getDateEntry(), merchandiseEntity.getDateExit());
    }

    public MerchandiseEntity merchandiseConvertToEntity(MerchandiseDTO merchandiseDTO){
        MerchandiseEntity merchandiseEntity = new MerchandiseEntity();

        merchandiseEntity.setVolumeOccupies(merchandiseDTO.getVolumeOccupies());
        merchandiseEntity.setWeightOccupies(merchandiseDTO.getWeightOccupies());
        merchandiseEntity.setName(merchandiseDTO.getName());
        merchandiseEntity.setDescription(merchandiseDTO.getDescription());
        merchandiseEntity.setDateEntry(merchandiseDTO.getDateEntry());
        merchandiseEntity.setDateExit(merchandiseDTO.getDateExit());

        return merchandiseEntity;
    }

}
