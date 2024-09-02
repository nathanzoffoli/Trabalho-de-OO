package com.mycompany.mavenproject1;

public class CPFException extends Exception {
    public CPFException(){
        super("CPF invalido, tente XXX.XXX.XXX-XX");
    }
}