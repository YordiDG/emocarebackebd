package com.sistema.emocare.excepciones;

public class UsuarioFoundException extends Exception{

    public UsuarioFoundException(){
        super("The user with that username already exists in the database, please try again !!");
    }

    public UsuarioFoundException(String mensaje){
        super(mensaje);
    }
}
