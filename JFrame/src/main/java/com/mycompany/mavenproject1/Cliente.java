package com.mycompany.mavenproject1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ch.qos.logback.classic.PatternLayout;

public class Cliente {
    public String email;
    public String numero;
    public String nome;
    public String rua;
    private String CPF; 

    public String getCPF() {
        return CPF;
    }

//    public void setCPF(String CPF) {
//        this.CPF = CPF;
//    }

    public String getEmail() {
        return email;
    }

   /* public void setEmail(String email) {
        this.email = email;
    }
         */

    public String getNumero() {
        return numero;
    }

//    public void setNumero(String numero) {
//        this.numero = numero;
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

//    public void setRua(String rua) {
//        this.rua = rua;
//    }
    
    public Cliente(String email,String numero,String nome,String rua,String CPF){
        this.email = email;
        this.numero = numero;
        this.nome = nome;
        this.rua = rua;
        this.CPF = CPF;
    }
    public boolean isValidNumber(String numero){
        if(numero.charAt(0)=='0'){
            if(numero.length()!=12){
                return false;
            }
        }
        if(numero.length()!=11){
            return false;
        }
        return true;
    }
    public void setNumero(String numero) throws NumeroException{
        if(!isValidNumber(numero)){
            throw new NumeroException();
        }
        this.numero = numero;
    }
    public boolean isValidCPF(String CPF){
        if(CPF.length()!=11){
            return false;
        }
        return true;
    }
    public void setCPF(String CPF) throws CPFException{
       if(!isValidCPF(CPF)){
           throw new CPFException();
       }
       this.CPF = CPF;
    }
    public void setRua(String rua) throws RuaException{
        if(!isValidRua(rua)){
            throw new RuaException();
        }
        this.rua = rua;
    }
    public boolean isValidRua(String rua){
        String RuaCerta = "^[a-zA-Z]+,[0-9]+$";
        Pattern pattern = PatternLayout.compile(RuaCerta);
        Matcher matcher = pattern.matcher(rua);
        return matcher.matches(); 
    }

    private boolean isValidEmail(String email) {
        String emailCerto = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailCerto);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public void setEmail(String email) throws EmailException {
        if(! isValidEmail(email)){
            throw new EmailException();
        }
        
        this.email = email;
        //String[] partes = email.split("@");

        /*this.login = partes[0];
        this.dominio = partes[1];*/
    }
}
