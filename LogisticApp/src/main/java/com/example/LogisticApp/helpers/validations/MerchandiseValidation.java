package com.example.LogisticApp.helpers.validations;

import java.time.LocalDate;

public interface MerchandiseValidation {

    void validateVolumeOccupies(Double volumeOccupies);

    void validateWeightOccupies(Double weightOccupies);

    void validateName(String name);

    void validateDescription(String description);

    void validateDateEntry(LocalDate dateEntry);

    void validateDateExit(LocalDate dateExit);

}
