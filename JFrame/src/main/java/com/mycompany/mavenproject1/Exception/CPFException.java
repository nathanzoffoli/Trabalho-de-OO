//Autores:Luana Lauschner Avilez Vilarinho (202265062AC),Nathan Ferreira da Silva Zoffoli (201865191AC)
package com.mycompany.mavenproject1.Exception;

public class CPFException extends Exception {
    public CPFException(){
        super("CPF invalido, tente XXX.XXX.XXX-XX");
    }
}
