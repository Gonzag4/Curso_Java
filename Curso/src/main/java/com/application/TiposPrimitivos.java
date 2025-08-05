package com.application;

public class TiposPrimitivos {
    public static void main (String[] args){
        int a = 10;
        float b = 1.5f;
        float c = a * b; //a é promovido para double antes do cáuculo.



        System.out.println("Valor de c = " + c );

    }

}
