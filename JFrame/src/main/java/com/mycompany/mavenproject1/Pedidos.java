package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    public Cliente cliente;
    public List<Produto> produtos = new ArrayList<>();
    public int precoTotal;

    public Pedidos(Cliente cliente, List<Produto> produtos, int precoTotal){
        this.cliente = cliente;
        this.precoTotal = precoTotal;
        this.produtos = produtos;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setPrecoTotal(int precoTotal, List<Produto> produtos) {
        this.precoTotal = somaProdutos(produtos);
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public int getPrecoTotal() {
        return precoTotal;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public int somaProdutos(List<Produto> produtos){
        int soma = 0;
        for(int i = 0; i<produtos.size(); i++){
            soma += produtos.get(i).getValor();
        }
        return soma;
    }
}
