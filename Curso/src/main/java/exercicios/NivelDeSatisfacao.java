package exercicios;

public class NivelDeSatisfacao {
    public static void main(String[] args){
        int nivel = 3;
        String feedback;

        switch (nivel){

            case 1 -> feedback = "muito ruim";
            case 2 -> feedback = "insatisfeito";
            case 3 -> feedback = "bom";
            case 4 -> feedback = "muito bom";
            case 5 -> feedback = "otimo";
            default -> feedback = "opção invalida (deve estar entre 1 - 5)";

        }
        System.out.println("O nivel de satisfação é:" + feedback);
    }

}
