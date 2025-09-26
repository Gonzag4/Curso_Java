public class FinalVariables {
    final int numeroMaximo = 100;

    final String mensagem = "Bem-vindo ao mundo da programação!";

    public void imprimir(){
        System.out.println("O numero maximo é: " + numeroMaximo);
        System.out.println("A mensagem é: " + mensagem);

    }

    public static void main(String[] args){
        FinalVariables exemplo = new FinalVariables();
        exemplo.imprimir();

    }

}
