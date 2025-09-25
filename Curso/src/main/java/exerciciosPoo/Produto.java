package exerciciosPoo;

public class Produto {
    //atributos privados (emcasulamento) { variaveis menbros}
    private String nome;
    private double preco;
    private int quantidadeDeEstoque;

    public Produto(String nome, double preco, int quantidadeDeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeDeEstoque = quantidadeDeEstoque;

    }

    public void exibitInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeDeEstoque);

    }
}

