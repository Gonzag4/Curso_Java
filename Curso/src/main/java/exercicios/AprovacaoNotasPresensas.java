package exercicios;

public class AprovacaoNotasPresensas {
    public static void main(String[] args){
        int nota1 = 8;
        int nota2 = 6;
        int frequencia = 80;

        double media = (nota1 + nota2)/2.0;

        boolean aprovado = media >= 7 && frequencia >= 70;

        if (aprovado){
            System.out.println("O aluno esta aprovado");
        } else {
            System.out.println("O aluno esta reprovado");
        }

    }

}
