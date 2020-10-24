package modulo3.orientacaoObjetos.entidades;

public abstract class Pessoa {

	protected String nome;
    protected String CPF;
    protected String telefone;
    private String endereco;
    //protected != private.
    /*Foi identificado que as outras classes desse pacote possuiam essas 
    caracteristicas em comum, então foi optado por utilizar o modo herança 
    a fim de não tornar o código super repetitivo.

    Protected permite que AQUELES HERDANDO essas caracteristicas a acessem
    normalmente.

    Private vai exigir que todos usem o respectivo metodo
    */
    protected String numero;

    public String enderecoCompleto(){
        return endereco + ", " + numero + "//pra imprimir tem que fazer essas shenanigans";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
