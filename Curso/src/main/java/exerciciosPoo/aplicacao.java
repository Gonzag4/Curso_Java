package exerciciosPoo;

public class aplicacao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30, "Rua A, 123", "1234-5678");

        System.out.println("O nome dele é: " + pessoa.nome);
        System.out.println("Sua idade é: " + pessoa.getIdade()); //acessa via m
        System.out.println("seu endereço é: " + pessoa.getEndereco());
        System.out.println("seu telefone é: " + pessoa.getTelefone());
        pessoa.setIdade(13);
        System.out.println("a nova idade é: " + pessoa.getIdade());

        System.out.println("Endereço: " + pessoa.getEndereco()); // Acesso
        pessoa.setEndereco("Rua B, 456");
        System.out.println("Novo Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone()); // Acesso
        pessoa.setTelefone("8765-4321");
        System.out.println("Novo Telefone: " + pessoa.getTelefone());

    }

}
