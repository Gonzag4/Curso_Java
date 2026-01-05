package com.Input_Output;

import java.io.*;
import java.sql.SQLOutput;

public class exemploIO {
    public static void main(String[] args){

        try {
            //Escrevendo em um arquivo (Gravação)
            FileWriter writer = new FileWriter("meuArquivo.txt");
            writer.write("Olá mundo!"); //Grava dados
            writer.close(); // fechamento da gravação de arquivos

            //leitura de arquivos
            FileReader reader = new FileReader("meuArquivo.txt");

            int data = reader.read(); //faz a leitura

            while (data != -1){
                System.out.print((char)data); //faz o cast da data para caracteres

                data = reader.read();
            }
            reader.close();

        } catch (IOException e){
            System.out.println("Problema de IO: " + e.getMessage());
        }

    }
}
