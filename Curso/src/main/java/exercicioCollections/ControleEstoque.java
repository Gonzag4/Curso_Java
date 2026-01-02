package exercicioCollections;

import java.util.HashMap;
import java.util.Map;

public class ControleEstoque {

    public static void main(String[] args){
        Map<Integer,Integer> estoque = new HashMap<>();

        //adicionando produtos
        estoque.put(123, 50);
        estoque.put(456, 30);
        estoque.put(789, 20);

        //verificando quantidade disponivel de um produto
        int codigoProduto = 123;
        int quantidadeProduto = estoque.get(codigoProduto);
        System.out.println("Quantidade do Produto: " + codigoProduto + ": " + quantidadeProduto);

        //removendo produto do estoque
        int quantidadeRemovida = 10;
        if (quantidadeRemovida <= quantidadeProduto){
            estoque.put(codigoProduto, quantidadeProduto - quantidadeRemovida); //O método put é usado novamente para atualizar a quantidade no estoque.


            System.out.println("Quantidade do produto: " + codigoProduto + "  pós a remoção: " + (quantidadeProduto - quantidadeRemovida));
        }
        else{
            System.out.println("Quantidade insuficiente para a remoção.");
        }


    }

}
