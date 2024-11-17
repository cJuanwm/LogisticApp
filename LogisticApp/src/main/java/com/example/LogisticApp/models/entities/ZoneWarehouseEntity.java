package com.example.LogisticApp.models.entities;

import java.util.List;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class ZoneWarehouseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Double maxVolume;
    private Double maxWeight;
    private Double occupiedVolume;
    private Double occupiedWeight;
    @OneToMany(mappedBy = "zoneWarehouse")
    @JsonManagedReference
    private List<MerchandiseEntity> listOfMerchandises;

}
