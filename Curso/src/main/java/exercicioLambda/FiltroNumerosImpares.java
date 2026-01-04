package exercicioLambda;

import java.util.Set;
import java.util.HashSet;

public class FiltroNumerosImpares {
    public static void main(String[] args) {


        Set<Integer> numeros = new HashSet<>();

        //adicionando os números
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // implementando a expressçao lambda para filtar números

        numeros.removeIf(n -> n % 2 ==0);
        System.out.println("Numeros impares: " + numeros);
    }
}
