package com.mycompany.mavenproject1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import ch.qos.logback.classic.PatternLayout;

public class Cliente {
    public String email;
    public String numero;
    public String nome;
    public String rua;
    private String CPF; 

    public String getCPF() {
        return CPF;
    }

    public String getEmail() {
        return email;
    }

    public String getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public Cliente(String email,String numero,String nome,String rua,String CPF){
        this.email = email;
        this.numero = numero;
        this.nome = nome;
        this.rua = rua;
        this.CPF = CPF;
    }
    public boolean isValidNumber(String numero){
        /*if(numero.charAt(0)=='0'){
            if(numero.length()!=12){
                return false;
            }
        }
        if(numero.length()!=11){
            return false;
        }
        return true;*/
    
        if(numero.length()== 11 || numero.length() == 12){
            String numeroRegex = "^([0-9]{2,3})+[0-9]{5}+-[0-9]{4}$";
            Pattern pattern = Pattern.compile(numeroRegex);
            Matcher matcher = pattern.matcher(numero);
            return matcher.matches();
        }
        return false;
    }
    public void setNumero(String numero) throws NumeroException{
        if(!isValidNumber(numero)){
            throw new NumeroException();
        }
        this.numero = numero;
    }
    public boolean isValidCPF(String CPF){
        if(CPF.length()==11){
            String CPFRegex = "^[0-9]{3}\\.+[0-9]{3}\\.+[0-9]{3}\\.[0-9]{2}";
            Pattern pattern = Pattern.compile(CPFRegex);
            Matcher matcher = pattern.matcher(CPF);
            return matcher.matches();
        }
        return false;
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
        String ruaRegex = "^[a-zA-Z]+,[0-9]+$";
        Pattern pattern = Pattern.compile(ruaRegex);
        Matcher matcher = pattern.matcher(rua);
        return matcher.matches(); 
    }

    private boolean isValidEmail(String email) {
        String emailRegex= "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
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
