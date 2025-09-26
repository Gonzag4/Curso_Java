package exercicioArray;

public class ExercicioEscolar {
    public static void main(String[] args) {
        int tamanho = 5;

        double[] notas = new double[tamanho];

        //preenchendo manualmente o array com notas
        notas[0] = 7.5;
        notas[1] = 8.0;
        notas[2] = 6.0;
        notas[3] = 9.0;
        notas[4] = 4.0;

        System.out.println("Nota dos alunos: ");
        for (int i = 0; i < tamanho; i++){
            System.out.print(notas[i] + " ");
        }

    }


}
