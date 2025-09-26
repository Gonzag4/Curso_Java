package exerciciosPoo;

public class Livros {
    public String titulo;
    private String autor;
    protected int anoDePublicacao;
    double preco;

    public Livros(String titulo, String autor, int anoDePublicacao, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.preco = preco;
    }
    public Livros(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = 00;
        this.preco = 00.00;
    }
    public Livros(){
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.anoDePublicacao = 00;
        this.preco = 00.00;
    }
}
