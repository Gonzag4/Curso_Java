package com.generics;

public class Caixa<T> {
    private T coisasNaCaixa;

    public void guardar(T coisa) {
        this.coisasNaCaixa = coisa;
    }

    public T pegar(){
        return coisasNaCaixa;
    }

    public static void main (String[] args){
        // criando uma caixa para guardar Strings
        Caixa<String> caixaDetexto = new Caixa<>();
        caixaDetexto.guardar("Oi, mundo");
        String texto = caixaDetexto.pegar();
        System.out.println(texto);

        // caixa para numeros
        Caixa<Integer> caixaDeNumeros = new Caixa<>();
        Integer numero = Integer.valueOf (3);
        caixaDeNumeros.guardar(numero);

        Integer valorResgatado = caixaDeNumeros.pegar();
        System.out.println(valorResgatado);

    }
}
