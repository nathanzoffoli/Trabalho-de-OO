package com.mycompany.mavenproject1.Model;

public abstract class Produto {
    public String nome;
    public int valor;
    public String ingredientes;
    public String tamanho;

    public Produto(int valor){
        this.ingredientes = setIngredientes(ingredientes);;
        this.nome = setNome(nome);
        this.tamanho = setTamanho(valor);
        this.valor = valor;
    }

    public String getIngredientes() {
        return ingredientes;
    }
    public String getNome() {
        return nome;
    }
    public String getTamanho() {
        return tamanho;
    }
    public int getValor() {
        return valor;
    }
    /*public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }*/
    
    public String setTamanho(int valor) {
        if(valor == 30){
            return this.tamanho = "Pequena";
        }
        else{
            return this.tamanho = "Grande";
        }
    }
 
    public abstract String setNome(String nome);
    public abstract String setIngredientes(String ingrediente);
    
    public void setValor(int valor) {
        this.valor = valor;
    }

    public Produto(String nome, int valor, String tamanho) {
        this.nome = nome;
        this.valor = valor;
        this.tamanho = tamanho;
    }
    
    @Override
    public String toString(){
        return "Pizza de " + getNome() + "Tamanho: " + getTamanho() + "Valor " + getValor() + "Ingredientes: " +getIngredientes();
    }
}
