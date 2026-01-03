package exercicioClassesAbstratas;

public class Loja {
    private String cnpj;
    private String razaoSocial;
    protected boolean aberta;

    public  Loja(String cnpj, String razaoSocial){
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false;
    }


    //método para abrir a loja
    public void abrir(){
        this.aberta = true;
    }

    //método para fechar a loja
    public void fechar(){
        this.aberta = false;
    }

}
