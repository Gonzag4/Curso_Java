package exerciciosPoo;

public class Carro {
    private String marcaCarro;
    private String modeloCarro;
    private int anoDoCarro;

    public Carro(String marcaCarro, String modeloCarro, int anoDoCarro){
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.anoDoCarro = anoDoCarro;

    }
    public Carro(){
        marcaCarro = "desconhecido";
        modeloCarro = "desconhecido";
        anoDoCarro = 0;

    }

    public void exibirDetalhes(){
        System.out.println("A marca do carro é:" + marcaCarro);
        System.out.println("O modelo do carro é: " + modeloCarro);
        System.out.println("O ano do carro é: " + anoDoCarro);
        System.out.println("----------------------------");
    }

}
