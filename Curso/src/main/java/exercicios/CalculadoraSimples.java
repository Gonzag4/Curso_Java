package exercicios;

public class CalculadoraSimples {
    public static void main(String[] args){
        int a, b;
        a = 10;
        b = 2;

        int soma = a + b;
        int subitracao = a - b;
        int multiplicacao = a * b;
        double divisao = a / b;
        double modulo = a % b ;

        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da subitração é: " + subitracao);
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        System.out.println("O resultado da divisão é: " + divisao);
        System.out.println("O resultado do modulo é: " + modulo);


    }

}
