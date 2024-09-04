package com.example.LogisticApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class ZoneWarehouse {

    //zoneId
    private Integer id;
    //zoneName
    private String name;
    //maxVolume
    private Double maxVolume;
    //maxWeight
    private Double maxWeight;
    //occupiedVolume
    private Double occupiedVolume;
    //occupiedWeight
    private Double occupiedWeight;

    public ZoneWarehouse(){

    }

    public ZoneWarehouse(Integer id, String name, Double maxVolume, Double maxWeight, Double occupiedVolume, Double occupiedWeight) {
        this.id = id;
        this.name = name;
        this.maxVolume = maxVolume;
        this.maxWeight = maxWeight;
        this.occupiedVolume = occupiedVolume;
        this.occupiedWeight = occupiedWeight;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(Double maxVolume) {
        this.maxVolume = maxVolume;
    }

    public Double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Double getOccupiedVolume() {
        return occupiedVolume;
    }

    public void setOccupiedVolume(Double occupiedVolume) {
        this.occupiedVolume = occupiedVolume;
    }

    public Double getOccupiedWeight() {
        return occupiedWeight;
    }

    public void setOccupiedWeight(Double occupiedWeight) {
        this.occupiedWeight = occupiedWeight;
    }
}
