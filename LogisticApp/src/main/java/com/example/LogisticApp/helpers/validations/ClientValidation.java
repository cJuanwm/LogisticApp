package com.example.LogisticApp.helpers.validations;

import com.example.LogisticApp.models.entities.dtos.ClientDTO;

public interface ClientValidation {

    void validateClientData(ClientDTO clientDTO);

    void validateDocument(String document);

    void validateName(String name);

    void validateZipCode(String zipCode);

    void validateRol(String rol);

    void validateEmail(String email);

    void validatePhone(String phone);

}
