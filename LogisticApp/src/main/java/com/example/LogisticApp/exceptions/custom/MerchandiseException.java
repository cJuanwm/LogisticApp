package com.example.LogisticApp.exceptions.custom;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MerchandiseException extends RuntimeException{

    private String code;

    public MerchandiseException(String message, String code) {
        super(message);
        this.code = code;
    }

}
