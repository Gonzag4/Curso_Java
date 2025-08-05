package com.application;



public class Funcionarios {

    String nome;
    String cargo;
    int idade;


    //este é o construtor

    Funcionarios(String nomeInit, String cargoInit, int idadeInit){
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;

        /* isso a cima é a mesma coisa que:
        Funcionarios(String nome, String cargo, int idade){
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
         }
         */
    }
    public static void main(String [] args){

        //estudo de objetos

        Funcionarios funcionarios1 = new Funcionarios("joao", "Desenvolvedor",30);

        //funcionarios1.nome = "João";
       // funcionarios1.cargo = "gerente";        essa parte foi apenas do objeto
        //funcionarios1.idade = 22;

        Funcionarios funcionarios2 = new Funcionarios("maria", "Gerente", 50);

        //funcionarios2.nome = "João";   
        //funcionarios2.cargo = "gerente";      essa parte foi do objeto
        //funcionarios2.idade = 22;

        System.out.println("nome: " + funcionarios1.nome);
        System.out.println("cargo: " +  funcionarios1.cargo);
        System.out.println("idade: " + funcionarios1.idade);
        System.out.println("-----------------------------");
        System.out.println("nome: " + funcionarios2.nome);
        System.out.println("cargo: " +  funcionarios2.cargo);
        System.out.println("idade: " + funcionarios2.idade);


    }
}
