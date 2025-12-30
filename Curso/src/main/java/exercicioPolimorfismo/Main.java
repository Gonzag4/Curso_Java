package exercicioPolimorfismo;

public class Main {

    public static void main(String[] args){
        Operacao soma = new Soma();
        Operacao subtracao = new Subitracao();
        Operacao multiplicacao = new Multiplicacao();
        Operacao divisao = new Divisao();

        double num1 = 10;
        double num2 = 5;

        System.out.println("Soma " + soma.calcular(num1, num2));
        System.out.println("Subitração " + subtracao.calcular(num1, num2));
        System.out.println("Multiplicação " + multiplicacao.calcular(num1, num2));
        System.out.println("Divisão " + divisao.calcular(num1, num2));
    }
}
