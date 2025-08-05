package com.application;

public class ArrayTeste {
    public static void main(String[] args){
        int[] meuArray;// declaração do array

        meuArray = new int[3];
        meuArray[0] = 5; //saida 5
        meuArray[1] = 8; //saida 8
        meuArray[2] = 2; //saida 2

        meuArray = new int[]{5, 8, 2};

        System.out.println(meuArray[0]);
        System.out.println(meuArray[1]);
        System.out.println(meuArray[2]);

        meuArray[0] = 10;

        System.out.println(meuArray[0]);

        //percorrendo o array

        for(int i = 0; i < meuArray.length; i++) {
            System.out.println(meuArray[i]);

        }
    }
}
