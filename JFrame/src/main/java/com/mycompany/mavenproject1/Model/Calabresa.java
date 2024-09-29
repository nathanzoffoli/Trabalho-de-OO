//Autores:Luana Lauschner Avilez Vilarinho (202265062AC),Nathan Ferreira da Silva Zoffoli (201865191AC)
package com.mycompany.mavenproject1.Model;

public class Calabresa extends Produto{
    public Calabresa(int valor){
        super(valor);
    }

    @Override
    public String setIngredientes() {
        String ingredientes;
        return this.ingredientes = "Molho de tomate, mussarela, calabresa, oregano e azeitona";
        
    }

    @Override
    public String setNome() {
       String nome;
       return this.nome = "Calabresa";
        
    }
}
