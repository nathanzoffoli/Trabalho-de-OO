package com.mycompany.mavenproject1;

public class Produto {
    public String nome;
    public int valor;
    public String ingredientes;
    public String tamanho;

    public Produto(String nome, int valor, String ingredientes, String tamanho){
        this.ingredientes = ingredientes;
        this.nome = nome;
        this.tamanho = tamanho;
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
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    public Produto(String nome, int valor, String tamanho) {
        this.nome = nome;
        this.valor = valor;
        this.tamanho = tamanho;
    }

    
}
