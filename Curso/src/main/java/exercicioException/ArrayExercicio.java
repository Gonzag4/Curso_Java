package exercicioException;

public class ArrayExercicio {

    public static int acessarElementos(int[] array, int indice){
        try {
            return array[indice];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: indice fora dos limites do array");
            return -1; //valor padrão utilizado para indicar um erro
        }
    }


    public static void main(String[] args) {

        int[] meuArray = {1, 2, 3, 4, 5};

        // Teste com indices validos
        System.out.println("Elemento do indice 2: " + acessarElementos(meuArray, 2));
        System.out.println("Elemento do indice 3: " + acessarElementos(meuArray, 3));

        //Teste com indices invalidos
        System.out.println("Elemento do indice 10: " + acessarElementos(meuArray, 10));
    }

}