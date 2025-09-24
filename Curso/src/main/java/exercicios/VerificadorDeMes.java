package exercicios;

public class VerificadorDeMes {
    public static void main(String[] args){
        int mes = 5; // mes do ano fixo

        switch (mes){

            case 1:
                System.out.println("o mes do ano é janeiro");
                break;

            case 2:
                System.out.println("O mes do ano é Fevereiro");
                break;

            case 3:
                System.out.println("O mes do ano é março");
                break;

            case 4:
                System.out.println("O mes do ano é Abril");
                break;
            case 5:
                System.out.println("O mes do ano é Maio");
                break;
            case 6:
                System.out.println("O mes do ano é Junho");
                break;
            case 7:
                System.out.println("O mes do ano é Julho");
                break;
            case 8:
                System.out.println("O mes do ano é Agosto");
                break;
            case 9:
                System.out.println("O mes do ano é Setembro");
                break;
            case 10:
                System.out.println("O mes do ano é Outubro");
                break;
            case 11:
                System.out.println("O mes do ano é Novembro");
                break;
            case 12:
                System.out.println("O mes do ano é Dezembro");
                break;
            default:
                System.out.println("Valor inválido para mês.");
        }
    }
}
