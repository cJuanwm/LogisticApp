package com.example.LogisticApp.models.entities.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ZoneWarehouseDTO {

    private String name;
    private Double maxVolume;
    private Double maxWeight;
    private Double occupiedVolume;
    private Double occupiedWeight;
    private List<MerchandiseDTO> merchandiseDTOList;

}
