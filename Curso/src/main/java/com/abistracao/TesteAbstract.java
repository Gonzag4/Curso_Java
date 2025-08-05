package com.abistracao;

abstract class Carro {
    int codigo = 10;

    abstract void acelerar();
    void frear(){
        System.out.println("o carro esta acelerano rapidamente");

    }
}

class CarroF1 extends Carro{
    void acelerar(){
        System.out.println("O carro de formula 1 esta acelerando muito rapido!");
    }

}

class Caminhao extends Carro{
    void acelerar(){
        System.out.println("O caminhão esta acelerando devagar!");
    }
}

public class TesteAbstract {
    public static void main(String[] args){
        CarroF1 carroF1 = new CarroF1();
        Caminhao caminhao = new Caminhao();

        carroF1.acelerar();
        carroF1.frear();

        System.out.println("COD_Caminhão: " + caminhao.codigo);
        caminhao.acelerar();
        caminhao.frear();
    }
}
