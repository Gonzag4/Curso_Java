package com.collections;

import java.util.Set;
import java.util.HashSet;
// import java.util.*; importação de todo o pacote java .util

public class ExemploSet {

    public static void main(String[] args){
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("C++");

        //verificando se o conjunto contem um elemento:
        System.out.println("Contem 'Java'? " + conjunto.contains("Java"));//true entra em um boolean e verifica se java existe

        //adicionando mais elementos
        conjunto.add("JavaScript");
        conjunto.add("Ruby");

        // imprime --> [Java, Ptyhon, C++, JavaScript, Ruby]
        System.out.println("Conjunto completo: " + conjunto);

        //Removendo elemento
        conjunto.remove("Python");

        //impressão sem o conjunto que foi remvido
        System.out.println("Conjunto após remoção: " + conjunto);

        //tentando adicionar elementos duplicados
        boolean foiadicionado = conjunto.add("Java");
        System.out.println("Java foi adicionado novamente? " + foiadicionado); // fause <- retorno do boolean

        //limpando o conjunto
        conjunto.clear();
        System.out.println("Conjunto após limpar: " + conjunto);


    }
}
