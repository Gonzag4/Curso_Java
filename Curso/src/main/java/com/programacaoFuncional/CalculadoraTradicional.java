package com.programacaoFuncional;

public class CalculadoraTradicional {
    public double soma (double a, double b){
        return a + b;
    }

    public double subtrair (double a, double b){
        return a - b;
    }

    public  double multiplicar (double a, double b){
        return a * b;
    }

    public double dividir ( double a, double b){
        if (b == 0){
            throw new IllegalArgumentException("ERRO: Não é possivel dividir por zero.");
        }
        return a / b;
    }

    public static void main(String[] args){
        CalculadoraTradicional calculadora = new CalculadoraTradicional();

        double resultadoSoma = calculadora.soma(10,15);
        System.out.println("Resultado da soma: " + resultadoSoma);

        double resultadoSubtracao = calculadora.subtrair(10,15);
        System.out.println("Resultado da subitração: " + resultadoSubtracao);

        double resultadoMultiplicacao = calculadora.multiplicar(10,15);
        System.out.println("Resultado da Multiplicação: " + resultadoMultiplicacao);

        try {
            double resultadoDivisao = calculadora.dividir(10,0);
            System.out.println("Resultado da Divisão: " + resultadoDivisao);

        } catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
