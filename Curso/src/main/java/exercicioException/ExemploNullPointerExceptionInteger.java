package exercicioException;

public class ExemploNullPointerExceptionInteger {
    public static void main(String[] args){
        try{
            Integer numero = null; //variável nula
            System.out.println(numero.toString()); //tentartiva de usar uma variável nula
        } catch (NullPointerException e){
            System.out.println("Erro: Ocorreu um NullPointerException: " + e.getMessage());
        }
    }
}
