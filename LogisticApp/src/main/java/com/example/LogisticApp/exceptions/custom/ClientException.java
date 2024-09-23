package com.example.LogisticApp.exceptions.custom;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientException extends RuntimeException{

    private String code;

    public ClientException(String message, String code) {
        super(message);
        this.code = code;
    }

}
