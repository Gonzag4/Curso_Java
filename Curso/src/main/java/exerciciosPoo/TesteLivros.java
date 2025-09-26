package exerciciosPoo;

public class TesteLivros {
    public static void main(String[] args){

        Livros livro1 = new Livros();
        System.out.println(livro1.titulo);
        System.out.println(livro1.anoDePublicacao);
        System.out.println(livro1.preco);

        //os nomes dos autores não podem ser imprimidos pois são private

        Livros livro2 = new Livros("harry Potter", "JK. Holling", 2003, 200.00);

    }

}
