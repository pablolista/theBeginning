package modulo3.orientacaoObjetos;

import java.util.ArrayList;

import modulo3.orientacaoObjetos.entidades.Aluno;
import modulo3.orientacaoObjetos.entidades.Diretor;
import modulo3.orientacaoObjetos.entidades.Professor;

public class Controle {
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Diretor> diretores = new ArrayList<>();
    private ArrayList<Professor> professores = new ArrayList<>();
    //criam novas listas usando os parametros de classes passados nos outros arquivos, armazenam eles variaveis que criei aqui e indica que funcionaram como listas

    public void iniciar() {
        Aluno aluno1 = new Aluno();
        //cria variavel aluno1 de acordo com a classe Aluno e aciona o construtor default da classe
        aluno1.setNome("Herasmo Carlos");
        //esses sets ainda funcionam por que estao sendo herdados do PROTECTED
        //da PESSOA
        aluno1.setCPF("12345678999");
        aluno1.setTelefone("(22)3529-4835");
        aluno1.setEndereco("Rua xis");
        aluno1.setNumero("10");
        aluno1.setMatricula(123456);
        //cria o "aluno1" de acordo com a classe aluno, que foi criada em outro arquivo, e passa os parametros para as respectivas variaveis
        alunos.add(aluno1);
        //adiciona o aluno1 há lista alunos criada anteriormente

        Aluno aluno2 = new Aluno("Maria Souza", "01234567899", "(22) 2654-3529", "Rua Ipsulon", 666587);
        //cria variavel aluno1 de acordo com a classe Aluno e aciona o construtor criado na classe com as variaveis como parametros
        alunos.add(aluno2);



        Diretor diretor1 = new Diretor();

        diretor1.setNome("Augusto");
        diretor1.setCPF("22222222222");
        diretor1.setTelefone("2233333333");
        diretor1.setEndereco("Espero que esse set faça seu trabalho e add endereco");
        //endereco esta private em Pessoa, espero que só esse set já seja o sufi-
        //ciente pra acessar e add endereco **Colocando mouse em cima de setEndereco
        //mostra que esta linkado com a Pessoa
        diretor1.setSetor("Escada");

        diretores.add(diretor1);

        System.out.println(aluno1.enderecoCompleto());
        System.out.println(aluno1);

    }
    
}
