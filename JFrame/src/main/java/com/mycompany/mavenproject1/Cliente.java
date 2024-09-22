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
    private String senha;

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

//    public void setRua(String rua) {
//        this.rua = rua;
//    }
    
    public Cliente(String email,String numero,String nome,String rua,String CPF,String senha){
        this.email = email;
        this.numero = numero;
        this.nome = nome;
        this.rua = rua;
        this.CPF = CPF;
        this.senha = senha;
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
            String CPFRegex = "^[0-9]{3}\\.+[0-9]{3}\\.+[0-9]{3}+-[0-9]{2}";
            Pattern pattern = Pattern.compile(CPFRegex);
            Matcher matcher = pattern.matcher(CPF);
            if(matcher.matches()){
                verificaCPF(CPF);
            }
        }
        return false;
    }
    public boolean verificaCPF(String CPF){
        String sem = CPF.replaceAll("[^0-9]", "");
        int tam = 11;
        int[] vetor = new int[tam];
        int numero;
        int mult = 10;
        int soma = 0;
        int dig1;
        char[] ch = sem.toCharArray();
        for(int i = 0; i < ch.length; i++){
             vetor[i] = ch[i] - '0';
        }
        for(int i = 0; i < 9; i++){
            soma+= mult*vetor[i];
            mult--;
        }
        int resto = soma%11;
        if(resto<2){
            dig1 = 0;
        }
        else{
            dig1 = 11-resto;
        }
        if(dig1 != vetor[9]){
            return false;
        }
        mult = 11;
        soma =0;
        for(int i = 0; i < 10; i++){
            soma+= mult*vetor[i];
            mult--;
        }
        resto = soma%11;
        int dig2;
        if(resto <2){
            dig2 = 0;
        }
        else{
            dig2 = 11-resto;
        }
        if(dig2 != vetor[10]){
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
        String ruaRegex = "^[a-zA-Z]+,[0-9]$";
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
