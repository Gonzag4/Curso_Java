package exercicioCollections;

import java.util.HashSet; // imports
import java.util.Set; // imports

public class SetExercise {
    public static void main(String[] args){
        //inicialização do conjunto
        Set<Integer> conjunto = new HashSet<>();

        //adicionando numeros ao conunto
        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);

        //imprimindo o conjunto
        System.out.println("Conjunto: " + conjunto);

        //verificando se 20 esta no conjunto
        boolean contemNumero20 = conjunto.contains(20); // cria um metodo contemNumero20
        System.out.println("O número 20 esta no conjunto? " + contemNumero20);

        //removendo 10
        conjunto.remove(10);

        //imprimindo os numeros restantes
        System.out.println("Numeros restantes " + conjunto);



    }
}
