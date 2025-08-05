package com.application;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeDeEstoque;

    public Produto (String nomeInit, double precoInit, int quantidadeDeEstoqueInit){
        nome = nomeInit;
        preco = precoInit;
        quantidadeDeEstoque = quantidadeDeEstoqueInit;

    }
    //metodo de exibição do produto
    public void exibirInformacoes () {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Estoque: " + quantidadeDeEstoque);

    }



}
