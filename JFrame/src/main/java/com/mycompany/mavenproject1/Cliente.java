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
    private String adicional;
    public String CEP;

    public String getCEP() {
        return CEP;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    public String getAdicional() {
        return adicional;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

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
    
    public Cliente(String email,String numero,String nome,String rua,String CPF,String senha)throws EmailException, NumeroException, CPFException, RuaException {
        setEmail(email);
        setNumero(numero);
        this.nome = nome;
        setRua(rua);
        setCPF(CPF);
        this.senha = senha;
    }
    public boolean isValidCEP(String CEP){
        if(CEP.length() == 9){
            String CEPRegex = "^[0-9]{5}-[0-9]{3}$";
            Pattern pattern = Pattern.compile(CEPRegex);
            Matcher matcher = pattern.matcher(CEP);
            return matcher.matches();
        }
        return false;
    }
    public void setCEP(String CEP) throws CEPException {
        if(!isValidCEP(CEP)){
            throw new CEPException();
        }
        this.CEP = CEP;
    }
    public boolean isValidNumber(String numero){

        if(numero.length()== 15 || numero.length() == 14){
            String numeroRegex = "^\\([0-9]{2,3}\\)[0-9]{5}-[0-9]{4}$";
            //String numeroRegex = "^^\\(?[0-9]{2,3}\\)?[0-9]{5}-[0-9]{4}$";
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
        if(CPF.length()==14){
            String CPFRegex = "^[0-9]{3}+\\.[0-9]{3}+\\.[0-9]{3}+-[0-9]{2}";
            Pattern pattern = Pattern.compile(CPFRegex);
            Matcher matcher = pattern.matcher(CPF);
            if(matcher.matches()){
                verificaCPF(CPF);
            }
            return matcher.matches();
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
        String ruaSem = rua.replaceAll(" ", "");
        String ruaRegex = "^[a-zA-Z\\s]+,\\s*[0-9]{1,}$";
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
