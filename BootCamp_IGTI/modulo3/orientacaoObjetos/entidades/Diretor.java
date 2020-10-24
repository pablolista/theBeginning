package modulo3.orientacaoObjetos.entidades;

public final class Diretor extends Pessoa{
    //Esse FINAL indica que essa classe não pode ser utilizada como herança (extends) por outra
    
    //private String nome;
    //private String CPF;
    //private String telefone;
    //private String endereco;
    private String setor;


    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
}
