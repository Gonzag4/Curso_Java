package com.collections;

import java.util.Map;
import java.util.HashMap;

public class ExemploMap {
    public static void main(String[] args){
        Map<String, Integer> mapa = new HashMap<>();

        //adicionando elementos
        mapa.put("Java", 20);
        mapa.put("Python", 15);
        mapa.put("C++", 20);

        //verifica se existe um elemento
        System.out.println("Contem 'Java' " + mapa.containsKey("Java")); // true <- entra no booleano para verificar

        //imprime valor da associação de uma chave
        System.out.println("Valor associado a 'Java' " + mapa.get("Java")); //20 <- valor que java recebe

        mapa.put("JavaScript",25);
        mapa.put("Ruby", 5);

        //imprime de forma desordenada
        System.out.println("Impressão do mapa completo: " + mapa);

        mapa.remove("Python"); //removendo o elemento
        System.out.println("Impressão após a remoção: " + mapa);

        mapa.put("Java", 30); //atualizando o valor de uma chave
        System.out.println("Valor associado a 'Java' " + mapa.get("Java")); // para mostrar o novo valor de java
        System.out.println("impressão após a atualização: " + mapa);

        mapa.clear();
        System.out.println("Mapa após limpeza: " + mapa);
            // obs: todos podem ter o mesmo valor, mas apenas uma unica chave.


    }
}
