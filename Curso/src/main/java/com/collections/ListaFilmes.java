package com.collections;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ListaFilmes {
    public static void main(String[] args){
        List<String> filmes = new ArrayList<>();

        // Adiciona filmes à lista
        filmes.add("O Poderoso Chefão");
        filmes.add("Matrix");
        filmes.add("Interestelar");

        //imprime lista de filmes
        for (String filme : filmes){
            System.out.println(filme);
        }

        //verifica se um filme especifico esta na lista
        String buscarFilme = "Matrix";
        if (filmes.contains(buscarFilme)){
            System.out.println(buscarFilme + " Esta na lista.");
        }
        else {
            System.out.println(buscarFilme + " Não esta na lista.");
        }

    }
}
