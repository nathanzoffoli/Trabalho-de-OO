package com.mycompany.mavenproject1;

public class CEPException extends Exception{
    public CEPException(){
        super("CEP invalido, tente XXXXX-XXX");
    }
}
