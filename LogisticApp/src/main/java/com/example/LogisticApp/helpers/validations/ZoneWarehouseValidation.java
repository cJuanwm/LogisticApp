package com.example.LogisticApp.helpers.validations;

public interface ZoneWarehouseValidation {

    void validateName(String name);

    void validateMaxVolume(Double maxVolume);

    void validateMaxWeight(Double maxWeight);

    void validateOccupiedVolume(Double occupiedVolume);

    void validateOccupiedWeight(Double occupiedWeight);

}
