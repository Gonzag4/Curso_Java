package exercicioProgramacaoFuncional;
@FunctionalInterface

interface OperacaoMatematica {
    double execultar(double a, double b);

}


public class CalculadoraPersonalizada {
    public static void main(String[] args){
        OperacaoMatematica potencia = (a, b) -> Math.pow(a, b);
        System.out.println("Potencia: " +  potencia.execultar(10 , 5));

        OperacaoMatematica raizQuadrada = (a, b) -> Math.sqrt(a + b);
        System.out.println("Raiz quadrada da soma: " + raizQuadrada.execultar(10, 5));

    }
}
