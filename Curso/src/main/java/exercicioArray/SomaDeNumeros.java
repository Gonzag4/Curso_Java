package exercicioArray;

public class SomaDeNumeros {
    public static void main(String[] args){

        int [] numeros = new int[1000];
        int soma = 0;

        for (int i = 1; i <= 1000; i++){
            numeros[i - i] = i;
            soma += i;
        }

        System.out.println("Soma dos numeros de 1 ate 1000: " + soma);

    }

}
