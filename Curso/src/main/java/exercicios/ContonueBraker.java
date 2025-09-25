package exercicios;

public class ContonueBraker {
    public static void main(String[] args){
        int codigoDeSaida = 9;

        // laço que percorre codigo carteirinha de 1 a 10
        for(int codogoCarteirinha = 1; codogoCarteirinha <= 10; codogoCarteirinha++){
            //verifica se o codigo carteirinha é igual ao codigo de saida
            if (codogoCarteirinha == codigoDeSaida){
                System.out.println("Codigo de saida encontrado");
                break;
            }
            // verifica se o codigo carteirinha é acoito pelo hospital
            if (codogoCarteirinha == 3 || codogoCarteirinha == 7 || codogoCarteirinha ==10) {

                System.out.println("O codigo carteirinha " + codogoCarteirinha + " é aceito pelo hospital");
                continue;
            }

            //outros códigos de carteirinha
            System.out.println("O código da carteirinha " + codogoCarteirinha + " não é aceito pelo hospital Santa Clara.");

        }
    }
}
