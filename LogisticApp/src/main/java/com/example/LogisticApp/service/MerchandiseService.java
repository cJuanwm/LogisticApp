package com.example.LogisticApp.service;

import com.example.LogisticApp.models.Client;
import com.example.LogisticApp.models.Merchandise;
import com.example.LogisticApp.repository.IMerchandiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchandiseService {

    @Autowired
    private IMerchandiseRepository merchandiseRepository;

    //Registrar en la BD una mercancia

    public Merchandise register(Merchandise merchandise) throws Exception{
        //Verificar si las validaciones son correctas
        //Si validacion pasa podria necesitar hacer operacoin con los datos
        //Si la validacion pasa yo guardo la mercancia
        //Si no pasa la validacion esponder al cliente con un mensaje de error
        try{

        }catch(Exception e){

        }
        return null;
    }

    //Consultar la informacion de todas las mercancias

    //Consultar la finromacion de una mercancia por id

    //Consultar la informacion de una mercancia por nombre

    //Modificar la informacion de una mercancia entregandole un id y la nueva info

    //Eliminar una mercancia de la BD


}
