package com.example.LogisticApp.helpers.validations;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;

import com.example.LogisticApp.exceptions.ClientExceptionMessage;
import com.example.LogisticApp.exceptions.ClientExceptionCode;
import com.example.LogisticApp.exceptions.custom.ClientException;
import com.example.LogisticApp.models.entities.dtos.ClientDTO;
import com.example.LogisticApp.models.entities.ClientEntity;
import com.example.LogisticApp.shared.CommonRegexPattern;
import com.example.LogisticApp.shared.CommonValidation;

@Component
@RequiredArgsConstructor
public class ClientValidationImpl implements ClientValidation, CommonValidation {

    private final CommonRegexPattern commonRegexPattern;

    @Override
    public void validateClientData(ClientDTO clientDTO){
        validateDocument(clientDTO.getDocument());
        validateName(clientDTO.getName());
        validateDepartment(clientDTO.getDepartment());
        validateMunicipality(clientDTO.getMunicipality());
        validateAddress(clientDTO.getAddress());
        validateZipCode(clientDTO.getZipCode());
        validateRol(clientDTO.getRol());
        validateEmail(clientDTO.getEmail());
        validatePhone(clientDTO.getPhone());
    }

    @Override
    public void validateDocument(String document) throws ClientException {
        if (!document.matches("^(CC|TI|P)-\\d+$")) {
            throw new ClientException(ClientExceptionMessage.WRONG_DOCUMENT_FORMAT.getMessage(), ClientExceptionCode.CODE_WRONG_DOCUMENT_FORMAT.getCode());
        }
        if(document.length() > 20){
            throw new ClientException(ClientExceptionMessage.WRONG_DOCUMENT_LENGTH.getMessage(), ClientExceptionCode.CODE_WRONG_DOCUMENT_LENGTH.getCode());
        }
    }

    @Override
    public void validateName(String name) throws ClientException {
        if (!name.matches("^[A-Za-zÀ-ÖØ-öø-ÿ' -]+$")){
            throw new ClientException(ClientExceptionMessage.WRONG_NAME_FORMAT.getMessage(), ClientExceptionCode.CODE_WRONG_NAME_FORMAT.getCode());
    }
    }

    @Override
    public void validateZipCode(String zipCode) throws ClientException {
        if(!zipCode.matches("^\\d{5}(-\\d{4})?$")){
            throw new ClientException(ClientExceptionMessage.WRONG_ZIP_CODE_FORMAT.getMessage(), ClientExceptionCode.CODE_WRONG_ZIP_CODE_FORMAT.getCode());
        }
        if (zipCode.length() > 5){
            throw new ClientException(ClientExceptionMessage.WRONG_ZIP_CODE_LENGTH.getMessage(), ClientExceptionCode.CODE_WRONG_ZIP_CODE_LENGTH.getCode());
        }
    }

    @Override
    public void validateRol(String rol) throws ClientException {
        if (!rol.matches("^(ADMIN|USER|MODERATOR)$")){
            throw new ClientException(ClientExceptionMessage.WRONG_ROL_FORMAT.getMessage(), ClientExceptionCode.CODE_WRONG_ROL_FORMAT.getCode());
        }
    }

    @Override
    public void validateEmail(String email) throws ClientException {
        if (!email.matches(".+@.+\\..+")){
            throw new ClientException(ClientExceptionMessage.WRONG_EMAIL_FORMAT.getMessage(), ClientExceptionCode.CODE_WRONG_EMAIL_FORMAT.getCode());
        }
    }

    @Override
    public void validatePhone(String phone) throws ClientException {
        if (!phone.matches("^\\d+$")){
            throw new ClientException(ClientExceptionMessage.WRONG_PHONE_FORMAT.getMessage(), ClientExceptionCode.CODE_WRONG_PHONE_FORMAT.getCode());
        }
    }

    @Override
    public void validateClientExistence(ClientDTO clientRequested, ClientEntity clientInDb) throws ClientException{
        if(clientInDb != null && clientRequested.getDocument().equals(clientInDb.getDocument())){
            throw new ClientException(ClientExceptionMessage.CLIENT_ALREADY_EXIST.getMessage(), ClientExceptionCode.CODE_CLIENT_ALREADY_EXIST.getCode());
        }
    }

    @Override
    public void validateDepartment(String department) throws ClientException {
        if (!department.matches(commonRegexPattern.getDepartmentRegex())){
            throw new ClientException(ClientExceptionMessage.WRONG_DEPARTMENT_FORMAT.getMessage(), ClientExceptionCode.CODE_WRONG_DEPARTMENT_FORMAT.getCode());
        }
    }

    @Override
    public void validateMunicipality(String municipality) throws ClientException {
        if (!municipality.matches(commonRegexPattern.getMunicipalityRegex())){
            throw new ClientException(ClientExceptionMessage.WRONG_MUNICIPALITY_FORMAT.getMessage(), ClientExceptionCode.CODE_WRONG_MUNICIPALITY_FORMAT.getCode());
        }
    }

    @Override
    public void validateAddress(String address) throws ClientException {
        if (!address.matches(commonRegexPattern.getAddressRegex())){
            throw new ClientException(ClientExceptionMessage.WRONG_ADDRESS_FORMAT.getMessage(), ClientExceptionCode.CODE_WRONG_ADDRESS_FORMAT.getCode());
        }
    }

}
