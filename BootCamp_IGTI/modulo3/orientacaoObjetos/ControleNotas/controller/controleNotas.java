package modulo3.orientacaoObjetos.ControleNotas.controller;

import java.util.ArrayList;
import java.util.Scanner;

import modulo3.orientacaoObjetos.ControleNotas.entidades.Materia;
import modulo3.orientacaoObjetos.ControleNotas.entidades.Nota;
import modulo3.orientacaoObjetos.ControleNotas.entidades.Professor;
import modulo3.orientacaoObjetos.ControleNotas.interfaces.ControlesBasicos;
import modulo3.orientacaoObjetos.ControleNotas.entidades.Aluno;

public class controleNotas implements ControlesBasicos {
/*
Faltou implementar a interface. Os metodos estao la em baixo vazio só pra
não dar erro de não implementação, mas deveria ter posto ele entre as opções do menu
*/

    private Scanner scanner = new Scanner(System.in);
//    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Materia>  materias = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();

    private String mostrarMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("Digite o comando desejado: \n");
        sb.append("1 - adicionar aluno\n");
        sb.append("2 - ver alunos\n");
        sb.append("3 - ver materias\n");
        sb.append("4 - inserir notas\n");
        sb.append("0 - para sair\n");

        System.out.println(sb.toString());

        return scanner.nextLine();
    }



    public void iniciar(){
        inicializarProfessorMateria();
        String opcao = mostrarMenu();
        while (!opcao.equals("0")){
            switch (opcao) {
                case "1":
                    System.out.println("Digite o nome do aluno:");
                    String nome = scanner.nextLine();

                    System.out.println("Digite a matricula do aluno:");
                    Integer matricula = Integer.parseInt(scanner.nextLine());

                    Aluno aluno = new Aluno(nome, matricula);
                    alunos.add(aluno);



                    opcao = mostrarMenu();
                    //Mostra novamente o menu

                    break;
                case "2":
                    System.out.println("\n" + alunos + "\n");
                    //vai imprimir "certo" porq la em Aluno tem a explicaçao do q eu quero

                    opcao = mostrarMenu();
                    //Mostra novamente o menu

                    break;
                case "3":
                    System.out.println("\n" + materias + "\n");
                    //vai imprimir "certo" porq la em Aluno tem a explicaçao do q eu quero

                    opcao = mostrarMenu();
                    //Mostra novamente o menu

                    break;
                case "4":
                    System.out.println("Digite o índice do aluno: ");
                    Integer indiceAluno = Integer.parseInt(scanner.nextLine());
                    System.out.println("Digite o índice da matéria: ");
                    Integer indiceMateria = Integer.parseInt(scanner.nextLine());
                    System.out.println("Digite a nota: ");
                    Double valorNota = Double.parseDouble(scanner.nextLine());


                    Nota nota = new Nota();
                
                    nota.setNota(valorNota);
                    nota.setMateria(materias.get(indiceMateria));
                    //materia já está na lista materias, diferente de nota que é uma classe
                    //separada que está sendo criada agora. Não vai existir uma lista separada de notas
                    //tal qual existe uma lista separada de materias e uma lista de alunos
                    //a lista de notas só vai existir dentro da lista de alunos
                    alunos.get(indiceAluno).getNotas().add(nota);


                    opcao = mostrarMenu();
                    //Mostra novamente o menu

                    break;
                case "0":
                    break;
            }
        }
    }


    public void inserir(){
        
    }
    public void excluir(){

    }
    public void consultar(){

    }


    private void inicializarProfessorMateria() {

        Professor professor1 = new Professor();
        professor1.setNome("juca");
        Materia materia1 = new Materia();
        materia1.setNome("Portugues");
        materia1.setProfessor(professor1);

        Professor professor2 = new Professor();
        professor2.setNome("joca");
        Materia materia2 = new Materia();
        materia2.setNome("Portugues2");
        materia2.setProfessor(professor2);

        Professor professor3 = new Professor();
        professor3.setNome("jeca");
        Materia materia3 = new Materia();
        materia3.setNome("Portugues3");
        materia3.setProfessor(professor3);

        Professor professor4 = new Professor();
        professor4.setNome("jica");
        Materia materia4 = new Materia();
        materia4.setNome("Portugues4");
        materia4.setProfessor(professor4);

        materias.add(materia1);
        materias.add(materia2);
        materias.add(materia3);
        materias.add(materia4);

    }
    
}
