package com.exercicioIO_NIO;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ManipulacaoArquivos {
    public static void main(String[] args){

        String nomeArquivo = "nomeArquivo.txt";
        String conteudo = "Olá, mundo! Este é um exemplo de escrita em arquivo.";

        //escrevendo no arquivo
        escrevendoNoArquivo (nomeArquivo,conteudo );

        //Lendo do arquivo
        String conteudoLido = lerDoArquivo(nomeArquivo);
        System.out.println("Conteudo lido do arquivo: " + conteudoLido);

    }

    public static void  escrevendoNoArquivo (String nomeArquivo, String conteudo){
        try{
            FileWriter writer = new FileWriter(nomeArquivo);
            writer.write(conteudo);
            writer.close();
            System.out.println("Arquivo criado no Texto escrito com sucesso!");

        } catch (IOException e){
            System.out.println("Erro de escrever no arquivo: " + e.getMessage());

        }
    }

    public static String lerDoArquivo(String nomeArquivo){
        StringBuilder conteudo = new StringBuilder();

        try{

            FileReader reader = new FileReader(nomeArquivo);
            int caractere;
            while ((caractere = reader.read()) != -1 ){ //-1 significa o fim do arquivo
                conteudo.append((char)caractere);
            }
            reader.close();

        }catch (IOException e){
            System.out.println("Erro de leitura: " + e.getMessage());
        }
        return conteudo.toString();
    }

}
