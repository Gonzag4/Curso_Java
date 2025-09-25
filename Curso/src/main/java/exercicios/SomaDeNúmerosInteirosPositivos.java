package exercicios;

public class SomaDeNúmerosInteirosPositivos {
    public static void main(String[] args){
        int numero = 10;
        int soma = 0;

        //calcular a soma dos numeros inteiros positivos
        do{
            soma = soma + numero;
            numero--;// decrementa o valor do numero

        }while (numero > 0 );

        System.out.println("A soma dos numeros inteiros positivos é: " + soma);
    }
}
