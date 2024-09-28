package com.mycompany.mavenproject1.Exception;

public class CEPException extends Exception{
    public CEPException(){
        super("CEP invalido, tente XXXXX-XXX");
    }
}
