package com.interfece;

interface SerVivo{
    void respirar(); //metodo abstrato " public abstract respirar();
}

interface Animal extends SerVivo {
    String DESCRICAO =  "ANIMAL É UM SER VIVO IMPORTANTE!";
    void fazerSom(); //metodo abstrato
}

//classe cachorro que implementa animal:
class Cachorro implements Animal {
    public void respirar(){}
    public void fazerSom() {
        System.out.println("O cachorro faz: AO AO!");
    }
}

//classe gato que implementa animal:
class Gato implements Animal{
    public void respirar(){}
    public void fazerSom(){
        System.out.println("O gato faz: MIAU MIAU!");
    }

}


public class TesteInterface {
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom(); // ele vai imprimir cachorro faz au au...

        Gato gato = new Gato();
        gato.fazerSom(); // vai imprimir o gato faz miau miau...

        System.out.println("Descrição da interface: " + Animal.DESCRICAO);
    }
}
