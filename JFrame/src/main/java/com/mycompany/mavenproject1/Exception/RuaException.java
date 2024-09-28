package com.mycompany.mavenproject1.Exception;

public class RuaException extends Exception {
    public RuaException(){
        super("Rua invalida, tente 'Nome da rua, XX' com o numero da rua tambem");
    }
}
