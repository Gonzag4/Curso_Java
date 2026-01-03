package com.exception;

// String test; -> inicialização automática! Neste teste será null;
// int testPrimitiva; -> inicialização automática! Neste teste será 0;

public class ExemploObjetosNulos {
    public static void main(String[] args){
        String nome = null;

        String nomeObj = new String("Gonzaga"); //variaveis locais devem ser iniciadas é (obrigatório)

        try{
            int nomeTamanho = nome.length(); // tentando acessar um objeto que está nulo
            System.out.println("O nome tem: " + nomeTamanho + "Letras.");
        } catch (NullPointerException e){
            System.out.println("ERRO: a variavel 'nome' esta nula!");
        } finally { // finally é opcional
            System.out.println("Sempre execute o bloco finally!");
        }
    }
}
