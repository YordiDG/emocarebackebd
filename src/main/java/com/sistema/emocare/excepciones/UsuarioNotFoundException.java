package com.sistema.emocare.excepciones;

public class UsuarioNotFoundException extends Exception{

    public UsuarioNotFoundException(){
        super("The user with that username does not exist in the database, try again !!");
    }

    public UsuarioNotFoundException(String mensaje){
        super(mensaje);
    }

}