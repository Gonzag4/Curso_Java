package com.exception;

public class ExceptionDivisaoPorZeroLancandoException {
    public static int calcularMedia(int totalNotas, int quantidadeAlunos)throws ArithmeticException{
        return totalNotas / quantidadeAlunos;
    }

    public static void main(String[] args){
        int totalNotas = 10;
        int quantidadeAlunos = 1; // -> o que faz lançar a exception!

        try {
            int media = calcularMedia(totalNotas, quantidadeAlunos);
            System.out.println("Média das notas: " + media);
        } catch (ArithmeticException ae){
            System.out.println("Erro: Divisão por zero! - " + ae.getMessage());
        } finally {
            System.out.println("Programa finalizado com ou sem problemas!");
        }

    }
}
