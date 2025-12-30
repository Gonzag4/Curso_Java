package exercicioPolimorfismo;

public class Divisao extends Operacao {
    @Override
    public double calcular (double a, double b){
        if(b != 0){
            return a / b;
        }
        else {
            System.out.println("erro! divisão por zero não permitida.");
            return Double.NaN; // NaN = retorna (not-a-number) para representar zero
        }
    }
}
