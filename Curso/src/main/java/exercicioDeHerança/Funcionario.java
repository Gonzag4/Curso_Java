package exercicioDeHerança;

public class Funcionario {
    private String nome;
    private double salario;

    public void addAumento(double valor){
        salario = salario + valor;
    }
    public double ganhoAnual(){
        return salario * 12;
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }
    public String getNome(){
        return nome;
    }

    public void setSalario(double novoSalario){
        salario = novoSalario;
    }

    public void getSalario(){
        return salario;
    }

}

class Assistente extends Funcionario{
    private int numeroMatricula;

    public double ganhoAnual(){
        return super.ganhoAnual() + 1000;
    }
}

public class TesteHeranca{
    public static void main(String[] args){
        Assistente assistente = new Assistente();
        assistente.addAumento(1000);
        assistente.setNome("João");
        assistente.setSalario(3000d);

        
        System.out.println("Nome: " + assistente.getNome());
        System.out.println("Salário anual: R$" +
                assistente.ganhoAnual());

    }
}
