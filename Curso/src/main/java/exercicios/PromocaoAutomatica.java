package exercicios;

public class PromocaoAutomatica {
    public static void main(String[] args) {
        byte a = 10;
        short b = 20;
        char c = 'A'; // O tipo char é usado para representar caracteres, como letras e símbolos
        int d = 30;
        long e = 40L;
        float f = 1.5f;
        double g = 2.5;

        // Exemplo de promoção automática: byte e short promovidos para int
        int resultado = a + b;
        System.out.println("Resultado da soma: " + resultado);

        // Mais exemplos com outros tipos
        long resultadoLong = d + e; // int promovido para long
        float resultadoFloat = d * f; // int promovido para float
        double resultadoDouble = d * g; // int promovido para double
        System.out.println("Resultado long: " + resultadoLong);
        System.out.println("Resultado float: " + resultadoFloat);
        System.out.println("Resultado double: " + resultadoDouble);

        // Exibindo o valor do char (conteúdo)
        System.out.println("Valor do char: " + c);
    }
}

/*
Explicação do Código:
1. Criamos uma classe chamada PromocaoAutomatica .
2. Declaramos variáveis de diferentes tipos.
3. Realizamos operações matemáticas envolvendo essas variáveis.
4. Exibimos os resultados na tela, incluindo o valor do tipo char .
 */