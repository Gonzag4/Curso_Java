package com.programacaoFuncional;

@FunctionalInterface
interface Calculadora{
    double calcular(double a, double b); // metodo abstrato
}

public class CalculadoraComInterfaceFuncional {
    public static void main(String[] args){
        Calculadora soma = (a, b) -> a + b; // impliementação do metodo e do objeto
        System.out.println("Soma: " + soma.calcular(10, 5 ));//chamada

        Calculadora subitracao = (a, b) -> a - b;
        System.out.println("Subitração: " +  subitracao.calcular(10, 5));

        Calculadora multiplicar = (a, b) -> a * b;
        System.out.println("Multiplicação: " + multiplicar.calcular(10, 5));

        Calculadora dividir = (a, b) -> a / b;
        System.out.println("Divisão: " + dividir.calcular(10, 5));

    }
}
