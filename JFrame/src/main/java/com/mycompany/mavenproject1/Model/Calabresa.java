package com.mycompany.mavenproject1.Model;

public class Calabresa extends Produto{
    public Calabresa(String nome, int valor, String ingredientes, String tamanho){
        super(nome, valor, ingredientes, tamanho);
    }

    @Override
    public void setIngredientes(String ingredientes) {
        this.ingredientes = "Molho de tomate, mussarela, calabresa, oregano e azeitona";
        
    }

    @Override
    public void setNome(String nome) {
       this.nome = "Calabresa";
        
    }
}
