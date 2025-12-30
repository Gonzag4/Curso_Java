package exercicioPolimorfismo;

public class Caminhao extends Veiculo{
    private int eixo;

    public Caminhao (String placa, int ano, int eixo){
        super(placa, ano);
        this.eixo = eixo;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Número de eixos: " + eixo);
    }
}
