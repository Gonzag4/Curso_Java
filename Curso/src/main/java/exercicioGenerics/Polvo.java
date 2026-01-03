package exercicioGenerics;

public class Polvo {
    private String nome;
    private int tentaculos;

    public Polvo (String nome, int tentaculos){
        this.nome = nome;
        this.tentaculos = tentaculos;

    }

    public String getNome(){
        return nome;
    }

    public int getTentaculos(){
        return tentaculos;
    }
}
