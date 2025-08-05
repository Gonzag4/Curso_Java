package com.application;

public class Aprovacao {
    public static void main(String[] args){
        int nota1 = 0;
        int nota2 = 10;
        int frequencia = 55;

        double media = (nota1 + nota2) / 2.0;

        if (media >= 6 && frequencia >= 75) {
            System.out.println("Você foi aprovado");

        } else if (media < 4 || frequencia < 75){
            System.out.println("Você foi reprovado");
        } else {
            System.out.println("Você esta em recuperação");
        }


    }
}
