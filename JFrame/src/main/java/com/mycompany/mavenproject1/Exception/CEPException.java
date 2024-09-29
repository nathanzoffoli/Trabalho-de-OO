//Autores:Luana Lauschner Avilez Vilarinho (202265062AC),Nathan Ferreira da Silva Zoffoli (201865191AC)
package com.mycompany.mavenproject1.Exception;

public class CEPException extends Exception{
    public CEPException(){
        super("CEP invalido, tente XXXXX-XXX");
    }
}
