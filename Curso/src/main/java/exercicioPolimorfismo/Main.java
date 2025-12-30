package exercicioPolimorfismo;

public class Main {

    public static void main(String[] args){
        Operacao soma = new Soma();
        Operacao subtracao = new Subitracao();
        Operacao multiplicacao = new Multiplicacao();
        Operacao divisao = new Divisao();

        double num1 = 10;
        double num2 = 5;

        System.out.println("Soma " + soma.calcular(num1, num2));
        System.out.println("Subitração " + subtracao.calcular(num1, num2));
        System.out.println("Multiplicação " + multiplicacao.calcular(num1, num2));
        System.out.println("Divisão " + divisao.calcular(num1, num2));

        // GerenciadorVeiculos:

        Veiculo veiculo1 = new Onibus("ABC123", 2020, 40);
        Veiculo veiculo2 = new Caminhao("XYZ789", 2019, 6);

        System.out.println("Detalhes do veículo 1 (Ônibus):");
        veiculo1.exibirInformacoes();
        System.out.println("---------------------------------");

        System.out.println("Detalhes do veículo 1 (Caminhão):");
        veiculo2.exibirInformacoes();
    }
}
