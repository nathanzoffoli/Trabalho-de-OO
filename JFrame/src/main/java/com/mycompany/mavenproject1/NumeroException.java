package com.mycompany.mavenproject1;

public class NumeroException extends Exception{
    public NumeroException(){
        super("Numero invalido, tente no formato XXXXXXXXXXX (11 algarismos)!");
    }
}