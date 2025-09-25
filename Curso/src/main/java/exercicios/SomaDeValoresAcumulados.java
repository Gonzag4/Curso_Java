package exercicios;

public class SomaDeValoresAcumulados {
    public static void main(String[] args){
        int soma = 0;

        for ( int i = 0; i <= 10; i++ ){
            soma += i; //soma o valor de i a variavel soma

        }
        System.out.println("A soma dos numeros de 1 a 10 é: " + soma);

    }
}
