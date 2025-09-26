package exerciciosPoo;

public class SalaDeAula {
    static int numeroDeAlunos = 0;


    public static void setNumeroDeAlunos(){
        numeroDeAlunos++;
    }

    public static void getNumeroDeAlunos(){
        System.out.println("total de alunos: " + numeroDeAlunos);
    }

}