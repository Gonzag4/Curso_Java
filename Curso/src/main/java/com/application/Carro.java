package com.application;

public class Carro {
    String marca;
    String modelo;
    int ano;

    //construtor Default
    //Carro() {
    //}

    //construtor completo
    Carro (String marcaInit, String modeloInit, int anoInit){
        marca = marcaInit;
        modelo = modeloInit;
        ano = anoInit;
    }

    /*
    tambem podemos escrever o construtor da seguinte forma:

       Carro (String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
     */

    public void exibirDetalhes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public static void main(String[] args) {

        Carro carro1 = new Carro("Gol", "G4", 2008);
        carro1.exibirDetalhes();
    }
}

