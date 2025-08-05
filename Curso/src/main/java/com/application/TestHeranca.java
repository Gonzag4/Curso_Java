package com.application;

class Animal {
    String nome;
    public void fazerSom(){
        System.out.println("O animal faz o som!");
    }
}
class Cachorro extends Animal{
    public void fazerSom(){
        super.fazerSom();
        System.out.println("O cachorro late!");
    }
}
/// 'é um?' ou 'é um tipo de'? ---->>> serve para saber se é uma herança ou não
public class TestHeranca {
    public static void main(String[] args){
        Cachorro dog = new Cachorro();
        dog.nome = "Rex";
        System.out.println("O nome do animal: " + dog.nome);

        dog.fazerSom();

    }
}
