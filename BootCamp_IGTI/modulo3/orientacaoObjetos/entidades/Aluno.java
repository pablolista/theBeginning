package modulo3.orientacaoObjetos.entidades;

public class Aluno {

    private String nome;
    private String CPF;
    private String telefone;
    private String endereco;
    private Integer matricula;

    public Aluno(){
        //cria um construtor default para a classe. Aqui criado somente para demonstração do funcionamento de um construtor default (utilizado em Controle.java) e de outro criado pelo usuario (abaixo, tbm usado em Controle.java)
    }

    public Aluno(String nome, String CPF,  String telefone, String endereco, Integer matricrula){
        //cria um construtor para a classe Aluno, que mais tarde sera tratada como a classe de um ArrayList
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.endereco = endereco;
        this.matricula = matricrula;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }


    public String getCPF(){
        return CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }


    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }


    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public Integer getMatricula() {
        return matricula;
    }
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}
