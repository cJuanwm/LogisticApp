package com.example.LogisticApp.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MerchandiseExceptionMessage {

    private final String message;
    private final String code;

}
