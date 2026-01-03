package exercicioGenerics;

public class Caixa <T>{
    private T[] elementos;


    public Caixa(int capacidade){
        elementos = (T[]) new Object[capacidade];
    }

    public void adicionar(T elemento, int indice){
        elementos[indice] = elemento;
    }

    public T obter (int indice){
        return elementos[indice];
    }

    public static void main(String[] args){
        //criando uma caixa de preços para double
        Caixa<Double> caixaPrecos = new Caixa<>(3);
        caixaPrecos.adicionar(10.5, 0);
        caixaPrecos.adicionar(20.0, 1);

        System.out.println("preço: " + caixaPrecos.obter(0)); // saida 10.5
        System.out.println("preço: " + caixaPrecos.obter(1)); //saida 20.0

        //criando uma caixa de letras para caracter
        Caixa<Character> caixaDeLetras = new Caixa<>(2);
        caixaDeLetras.adicionar('A', 0);
        caixaDeLetras.adicionar('B', 1);

        System.out.println("Letra: " + caixaDeLetras.obter(0)); // saida A
        System.out.println("Lletra: " + caixaDeLetras.obter(1)); // saida B



    }
}
