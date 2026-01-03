package com.exception;

class LancandoExceptionIntencionalmente {

    public static void main(String[] args) {
        int idade = 15; // idade para verificação

        if (idade < 18) {
            throw new RuntimeException("Idade deve ser 18 ou maior.");
        }

        System.out.println("Idade válida: " + idade);
    }
}

/*
Neste exemplo, se a idade for menor que 18,
o programa lançará uma RuntimeException com a mensagem
"Idade deve ser 18 ou maior".
 Assim, você pode controlar explicitamente quando uma exceção deve ser lançada,
 usando a palavra-chave throw.
 */
