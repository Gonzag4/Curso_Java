package com.Serialization;

import java.io.*;
import java.util.List;
import java.util.ArrayList;


public class ExemploSerializacao {
    //Método para serializar os contatos
    private static void serializarContatos(List<Contato> listarContatos) throws IOException{
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("agenda.ser"))){
            outputStream.writeObject(listarContatos);
            System.out.println("Contatos serializados salvos com sucesso!");
        }
    }

    //Método para ler o arquivo
    @SuppressWarnings("unchecked") //usado por conta da nota de compilação dobre cuidado com o cast
    private static void deserializarContatos() throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream((new FileInputStream("agenda.ser")))){
            List <Contato> contatosLidos = (List<Contato>) inputStream.readObject();
            for (Contato contato : contatosLidos){
                System.out.println("Nome: " + contato.nome + ", Telefone: " + contato.telefone);
            }
        }
    }
    public static void main(String[] args){

        Contato contato1 = new Contato("Arnaldo", "(11) 1234-5678");
        Contato contato2 = new Contato("Arisonia", "(01) 1534-5878");
        Contato contato3 = new Contato("Anatercio", "(10) 1204-5978");

        List<Contato> listaContatos = new ArrayList<>();
        listaContatos.add(contato1);
        listaContatos.add(contato2);
        listaContatos.add(contato3);

        try{
                serializarContatos(listaContatos);
                deserializarContatos();

        }catch (IOException | ClassNotFoundException e ){
            System.out.println("Erro ao manipular contatos: " + e.getMessage());
        }

    }

}
