package com.polimorfismo;

abstract class Animal{
    public abstract void fazerSom();

    //metodos polimorfos em java (que não são abistratos)
    public void tipoObjeto(){
        System.out.println("Objeto é do tipo animal");
    }

}
 class Cachorro extends Animal{ //subclasse cachorro
    public void fazerSom(){
        System.out.println("O Cachorro faz Ao Ao!");
    }
 }

 class Gato extends Animal{ // subclasse gato
    public void fazerSom(){
        System.out. println("O Gato faz miau miau!");
    }
 }

public class testePolimorfismo {
    public static void main(String[] args){

        //implementando o polimorfismo:
        //declara a classe mãe ----> instancia a classe filha
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.fazerSom(); //imprime o cachorro faz au au!
        gato.fazerSom(); // imprime o gato faz miau miau!

        cachorro.tipoObjeto(); // imprime: O objeto é do tipo animal
        gato.tipoObjeto(); //imprime: O objeto é do tipo animal

    }
}
