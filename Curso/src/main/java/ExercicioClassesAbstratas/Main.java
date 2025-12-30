package ExercicioClassesAbstratas;

public class Main {

    public static void main(String[] args){
        Retangulo retangulo = new Retangulo(5.0, 3.0);
        System.out.println("Area do retangulo " + retangulo.calcularArea());
        System.out.println("Area do perimetro " + retangulo.calcularPerimetro());


        // Loja abstrata:

        LojaComercial lojaComercial = new LojaComercial("123456789", "Minha Loja");
        lojaComercial.abrir(); //abre a loja
        System.out.println("A loja esta aberta? " + lojaComercial.aberta);
    }
}
