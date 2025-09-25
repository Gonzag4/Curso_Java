package exerciciosPoo;

public class MainCarro {
    public static void main(String[] args){
        Carro carro1 = new Carro("Toyota", "Toro", 2025);
        Carro carro2 = new Carro("Honda", "Civic", 2000);

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}
