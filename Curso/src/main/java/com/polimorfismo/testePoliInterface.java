package com.polimorfismo;

interface Veiculo{
    void acelerar();
}

class Carro implements Veiculo{
    public void acelerar(){
        System.out.println("O carro esta acelerando!");
    }
}

class Moto implements Veiculo{
    public void acelerar(){
        System.out.println("A moto esta acelerando!");
    }
}

public class testePoliInterface {
    public static void main(String[] args){
        //criando o polimorfismo
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        carro.acelerar();// imprime: O carro esta acelerando!
        moto.acelerar();// imprime: A Moto esta acelerando!
    }
}
