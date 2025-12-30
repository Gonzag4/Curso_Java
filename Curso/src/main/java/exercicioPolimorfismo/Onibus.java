package exercicioPolimorfismo;

public class Onibus extends Veiculo{
    private int assento;

    public Onibus (String placa, int ano, int assento){
        super(placa, ano);
        this.assento = assento;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Assento" + assento);
    }
}
