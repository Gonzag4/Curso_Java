package exerciciosPoo;

public class main{
    public static void main(String[] args){

        Produto produto1 = new Produto ("Notebook", 2000.00, 10);
        Produto produto2 = new Produto("TV", 1500.00, 20);

        produto1.exibitInformacoes();
        produto2.exibitInformacoes();


    }
}
