package com.expressoesLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaComCollection {
    public static void main(String[] args){
     List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5);
     List<Integer> numerosPares = new ArrayList<>();

        /*
     for (Integer elemento : listaNumeros){
         System.out.println(elemento);
     }
        */
        // listaNumeros.forEach((Integer numero) ->  System.out.println(numero));
        //  listaNumeros.forEach( (numero) ->  System.out.println(numero) ); -> ainda mais resumida
        listaNumeros.forEach( (numero) -> {
            if (numero % 2 == 0){
                numerosPares.add(numero);
            }
        });

        System.out.println("numeros pares: " + numerosPares);

    }
}
