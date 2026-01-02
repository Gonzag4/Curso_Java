package com.collections;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ExemploList {
    public static void main(String[] args){

        List<String> lista = new ArrayList<>();

        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        //verifcando elemento na lista
        System.out.println("Comtém 'Java' " + lista.contains("Java"));

        //adicionando elementos de outra coleção
        List<String> outraLista = Arrays.asList("JavaScript" , "Ruby");
        lista.addAll(outraLista); //adiciona outraLista a lista

        //imprime -> [Java, Python, C++, JavaScript, Ruby]
        System.out.println("Lista total: " + lista);

        //removendo Python
        lista.remove("Python");

        //imprime [Java, C++, JavaScript, Ruby]
        System.out.println("Lista após a remoção: " + lista);

        //obtendo elemento pelo indice
        String elemento = lista.get(2); // obtém o terceiro elemento da lista, pois começa a partir do 0
        System.out.println("O terceiro elemento da lista é: " + elemento);

        //limpando a lista
        lista.clear();

        //lista após a remoção:
        System.out.println("lista após ser limpa: " + lista);


    }
}
