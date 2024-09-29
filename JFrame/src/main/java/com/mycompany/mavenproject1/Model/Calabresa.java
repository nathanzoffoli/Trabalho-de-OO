package com.mycompany.mavenproject1.Model;

public class Calabresa extends Produto{
    public Calabresa(String nome, int valor, String ingredientes, String tamanho){
        super(nome, valor, ingredientes, tamanho);
    }

    @Override
    public String setIngredientes(String ingredientes) {
        return this.ingredientes = "Molho de tomate, mussarela, calabresa, oregano e azeitona";
        
    }

    @Override
    public String setNome(String nome) {
       return this.nome = "Calabresa";
        
    }
}
