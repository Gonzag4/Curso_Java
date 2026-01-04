package exercicioLambda;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ListaManipulacaoLambda {

    public static void main(String[] args){
       //criando a lista
        List<String> minhaLista = new ArrayList<>();

        minhaLista.add("maça");
        minhaLista.add("banana");
        minhaLista.add("cereja");
        minhaLista.add("abacaxi");

        //metodo de remoção da lista
        minhaLista.removeIf(s -> s.length() > 5);

        // adição de elementos
        minhaLista.add(0, "uva");

        //impressão dos elementos
        minhaLista.forEach(System.out::println);

    }

}
