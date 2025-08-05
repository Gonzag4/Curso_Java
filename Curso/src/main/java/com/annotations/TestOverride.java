package com.annotations;

class Animal {
    public String nome;

    public void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

public class TestOverride {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.fazerSom();


    }

}