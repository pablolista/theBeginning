package modulo3.orientacaoObjetos.entidades;

public final class Aluno extends Pessoa{
    //Esse FINAL indica que essa classe não pode ser utilizada como herança (extends) por outra

    private Integer matricula;

    public Aluno(){
        //cria um construtor default para a classe. Aqui criado somente para demonstração do funcionamento de um construtor default (utilizado em Controle.java) e de outro criado pelo usuario (abaixo, tbm usado em Controle.java)
    }

    public Aluno(String nome, String CPF,  String telefone, String endereco, Integer matricrula){
        //cria um construtor para a classe Aluno, que mais tarde sera tratada como a classe de um ArrayList
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        setEndereco(endereco);
        /*enquanto as outras acessam uma classe com PROTECTED, essa acessa
        com PRIVATE atraves do seu set. Só precisa disso aqui porq estou trabalhando
        com construtores definidos (variaveis dentro dos parenteses)
        */
        this.matricula = matricrula;
    }


    public Integer getMatricula() {
        return matricula;
    }
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}
