package com.Input_Output;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class ExemploNIO {
    public static void main(String[] args){
        Path path = Paths.get("meuArquivo.txt");

        try{
            //escrevendo um arquivo
        Files.write(path, "Olá, mundo!" .getBytes()); //path é a pasta e "Olá, mundo!" é oq escrevemos no arquivo

            //lendo o arquivo
            byte[] bytes = Files.readAllBytes(path);

            String content = new String(bytes);

            System.out.println(content);

        } catch (IOException e){
            System.out.println("Problema de IO: " + e.getMessage());

        }
    }
}
