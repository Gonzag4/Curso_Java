package com.generics;

public class CaixaDeBrinquedos {
    private Object coisaNaCaixa;

    public void guardar(Object coisa){
        this.coisaNaCaixa = coisa;
    }

    public Object pegar() {
        return coisaNaCaixa;
    }

    public static void main(String[] args){
        //criando uma caixa pra guardar os carrinhos
        CaixaDeBrinquedos caixaDeCarrinhos = new CaixaDeBrinquedos();
        caixaDeCarrinhos.guardar(new Carrinho("Hot Wheels")); //esta guardando uma instância da classe carrinho

        //Caixa para guardar bonecas
        CaixaDeBrinquedos caixaDeBonecas = new CaixaDeBrinquedos();
        caixaDeBonecas.guardar(new Boneca("Barbie")); // ele usa o new no parametro para faze o objeto diretamente

        //verifica o tipo do objeto antes de fazer o cast
        if (caixaDeCarrinhos.pegar() instanceof Carrinho){ //verifica se é um carrinho que esta na caixa de carrinho
            Carrinho carrinho = (Carrinho) caixaDeCarrinhos.pegar(); // converte o carrinho de um obj da classe pai em um carrinho
            System.out.println(carrinho.getModelo()); // imprime o carrinho Hot Wheels
        }

        if (caixaDeBonecas.pegar() instanceof Boneca){
            Boneca boneca = (Boneca) caixaDeBonecas.pegar(); //cria o objeto fazendo o cast diretamente
            System.out.println(boneca.getNome());// imprime barbie

        }

        
    }

    

}
