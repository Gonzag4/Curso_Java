package exercicioGenerics;

public class Cesto<T> {
    private T conteudo;

    public void guardar(T item) {
        this.conteudo = item;
    }

    public T pegar(){
        return conteudo;
    }

    public static void main(String[] args){
        Cesto<Peixe> cestoPeixe = new Cesto<>();
        cestoPeixe.guardar(new Peixe("Dourado", 37.8));
        Peixe peixe = cestoPeixe.pegar();

        System.out.println("Pegar peixe " + peixe.getNome() + " tamanho: " + peixe.getTamanho());

        Cesto<Polvo> cestoPolvo = new Cesto<>();
        cestoPolvo.guardar(new Polvo("Octopus", 8));
        Polvo polvo = cestoPolvo.pegar();

        System.out.println("Pegar polvo " + polvo.getNome() + " quantidade de tentaculos: " + polvo.getTentaculos());



    }
}
