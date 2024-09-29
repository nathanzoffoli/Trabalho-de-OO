package com.mycompany.mavenproject1.Model;

public class Mussarela extends Produto{
    public Mussarela(int valor){
        super(valor);
    }

    @Override
    public String setIngredientes() {
        String ingredientes;
        return this.ingredientes = "Molho de tomate, mussarela, tomate, oregano e azeitona";
        
    }

    @Override
    public String setNome() {
        String nome;
        return this.nome = "Mussarela";
        
    }
}
