package com.generics;

public class CaixaGenerica<T>{
    private T coisaNaCaixa;

    public void guardar(T coisa){
        this.coisaNaCaixa = coisa;
    }

    public T pegar(){
        return coisaNaCaixa;
    }

    public static void main(String[] args){

        //criando uma caixa para guardar carrinhos
        CaixaGenerica<Carrinho> caixaDeCarrinho = new CaixaGenerica<>();
                caixaDeCarrinho.guardar(new Carrinho("Hot Wheels"));

        // criando uma caixa de bonecas
        CaixaGenerica<Boneca> caixaDeBoneca = new CaixaGenerica<>();
                caixaDeBoneca.guardar(new Boneca("Barbie"));

        /* não é necessario fazer o cast, pois o metodo pegar() já retorna um carrinho e uma boneca
        tambem não é preciso verificar co o instanceof, pois ele já como um generico.
         */

        Carrinho carrinho = caixaDeCarrinho.pegar();
        Boneca boneca = caixaDeBoneca.pegar();

        System.out.println(carrinho.getModelo());
        System.out.println(boneca.getNome());
    }


}

