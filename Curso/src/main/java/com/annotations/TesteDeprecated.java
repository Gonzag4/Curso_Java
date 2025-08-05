package com.annotations;

class InformarRegras{

    @Deprecated
    public void mostrarRegrasDaPrevidencia(){
        System.out.println("Regras para a aposemtadoria: ");
    }

    public void novasRegrasDaPrevidencia(){
        System.out.println("Novas regras para a aposentadoria: ");
    }

}

@SuppressWarnings("ALL")
public class TesteDeprecated {
    public static void main(String[] args) {

        InformarRegras regras = new InformarRegras();

        //metodo obsoleto de informar regras: (deprecated)
        regras.mostrarRegrasDaPrevidencia();

        //metodo atualizado para informar regras:
        regras.novasRegrasDaPrevidencia();


    }
}
