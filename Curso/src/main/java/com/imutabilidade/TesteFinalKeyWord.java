package com.imutabilidade;


class ExemploFinal{
    // Definição de constante - uso de final
    final int CODIGO_FIXO = 10;

    //Método final
    final void meuMetodo(){
        System.out.println("Este é o metodo final.");
    }

}


public class TesteFinalKeyWord {
    public static void main(String[] args){
        ExemploFinal testeFinal = new ExemploFinal();

        /*
        final int testeFinalVariableLocal = 777;
        testeFinalVariableLocal = 333;
        System.out.println("Valor da variavel local: " + testeFinalVariablelLocal);

         */
        // testeFinal CODIGO_FIXO = 555;  // -->> Erro de compolação! ( é uma constante).

        System.out.println("Valor do codigo final: " + testeFinal.CODIGO_FIXO);
        testeFinal.meuMetodo();
    }


}
