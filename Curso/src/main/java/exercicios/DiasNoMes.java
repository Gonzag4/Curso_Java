package exercicios;

public class DiasNoMes {
    public static void main(String[] args){
        String mes = "Abril"; //altere o valor para testar diferentes meses

        int diasDoMes = switch (mes){
            case "Janeiro", "Março", "Maio", "Julho", "Agosto",
                 "Outubro", "Dezembro" -> 31;

            case "Abril", "Junho", "Setembro", "Novembro" -> 30;

            case "Fevereiro" -> 28; // Considerando um ano não bissexto

            default -> - 1; //valor invalido para mes desconhecido
        }; //ponto e virgula depois de fechar as chaves pois estamos atribuindo o valor de uma variavel

        if (diasDoMes != -1){
            System.out.println("numero de dias em " + mes + ": " + diasDoMes);

        } else {
            System.out.println("mês descnhecido!");
        }


    }
}
