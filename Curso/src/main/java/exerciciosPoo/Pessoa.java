package exerciciosPoo;

public class Pessoa {
    public String nome;
    private int idade;
    protected String endereco;
    String telefone;

    public Pessoa(String nome, int idade, String endereco, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    //metodos para idade
    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    //matodos para endereço
    public String getEndereco(){
        return  endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    // Métodos get e set para telefone
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
