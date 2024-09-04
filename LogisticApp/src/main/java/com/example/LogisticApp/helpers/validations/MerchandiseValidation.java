package com.example.LogisticApp.helpers.validations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MerchandiseValidation {

    //Validar que volumen solo sea positivo
    public boolean volumeValidation(double volumeGive){

        return volumeGive < 0;

    }
    //Validar que peso solo sea positivo
    public boolean
    //Validar que descripcion solo puede tener hasta 200 caracteres
    //Las fechas deben tener el formato MM/DD/YYYY

    public boolean formatValidation(LocalDate date) {

        String dateString = date.toString();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);
    }


}
