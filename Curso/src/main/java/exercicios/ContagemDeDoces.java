package exercicios;

public class ContagemDeDoces {
    public static void main(String[] args) {

        int contadorDoces = 1;

        while (contadorDoces <= 3 ){

            System.out.println("A criança comeu: " + contadorDoces + " doces");
            contadorDoces++;

        }

        System.out.println("A criança não pode comer mais doces");

        /*
        do{
            System.out.println("A criança comeu: " + contadorDoces + " doces");
            contadorDoces ++;

        } while (contadorDoces <= 3);
        */
    }
}
