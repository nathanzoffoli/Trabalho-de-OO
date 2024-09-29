package com.mycompany.mavenproject1.Model;

public class Portuguesa extends Produto{
    public Portuguesa(String nome, int valor, String ingredientes, String tamanho){
        super(nome, valor, ingredientes, tamanho);
    }

    @Override
    public void setIngredientes(String ingredientes) {
        this.ingredientes = "Molho de tomate, mussarela, preseunto, cebola, tomate, ovo cozido, oregano e azeitona";
        
    }

    @Override
    public void setNome(String nome) {
        this.nome = "Portuguesa";
        
    }
}
