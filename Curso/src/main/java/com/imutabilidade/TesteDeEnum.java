package com.imutabilidade;

enum DiaDaSemana{
    SEGUDA, TERÇA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}

public class TesteDeEnum {
    public static void main(String[] args){
        DiaDaSemana dia = DiaDaSemana.SEGUDA;
        DiaDaSemana dia2 = DiaDaSemana.TERÇA;
        System.out.println("Hoje é " + dia);
        System.out.println("Hoje é " + dia2);
    }

}
