package modulo3.orientacaoObjetos.ControleNotas.controller;

import java.util.ArrayList;
import java.util.Scanner;

import modulo3.orientacaoObjetos.ControleNotas.entidades.Materia;
import modulo3.orientacaoObjetos.ControleNotas.entidades.Professor;

public class controleNotas {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Materia>  materias = new ArrayList<>();


    public void iniciar() {

        Professor professor1 = new Professor();
        professor1.setNome("juca");
        Materia materia1 = new Materia();
        materia1.setNome("Portugues");
        materia1.setProfessor(professor1);

        Professor professor2 = new Professor();
        professor2.setNome("joca");
        Materia materia2 = new Materia();
        materia2.setNome("Portugues2");
        materia2.setProfessor(professor1);

        Professor professor3 = new Professor();
        professor3.setNome("jeca");
        Materia materia3 = new Materia();
        materia3.setNome("Portugues3");
        materia3.setProfessor(professor1);

        Professor professor4 = new Professor();
        professor4.setNome("jica");
        Materia materia4 = new Materia();
        materia4.setNome("Portugues4");
        materia4.setProfessor(professor1);


    }
    
}
