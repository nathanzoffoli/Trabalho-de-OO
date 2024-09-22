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

    Produto PizzaCalabresaPequena = new Produto("Calabresa", 30, "Molho de tomate, mussarela, calabresa, oregano e azeitona", "Pequena");
    Produto PizzaCalabresaGrande = new Produto("Calabresa", 40, "Molho de tomate, mussarela, calabresa, oregano e azeitona", "Grande");
    Produto PizzaPortuguesaPequena = new Produto("Portuguesa", 30, "Molho de tomate, mussarela, preseunto, cebola, tomate, ovo cozido, oregano e azeitona", "Pequena");
    Produto PizzaPortuguesaGrande = new Produto("Portuguesa", 40, "Molho de tomate, mussarela, preseunto, cebola, tomate, ovo cozido, oregano e azeitona", "Grande");
    Produto PizzaMussarelaPequena = new Produto("Mussarela", 30, "Molho de tomate, mussarela, tomate, oregano e azeitona", "Pequena");
    Produto PizzaMussarelaGrande = new Produto("Mussarela", 40, "Molho de tomate, mussarela, tomate, oregano e azeitona", "Grande");
}
