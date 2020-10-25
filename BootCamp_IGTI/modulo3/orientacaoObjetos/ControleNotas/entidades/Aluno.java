package modulo3.orientacaoObjetos.ControleNotas.entidades;

import java.util.ArrayList;

public class Aluno extends Pessoa {

    private Integer matricula;
    private ArrayList<Nota> notas;


    public Aluno(String nome, Integer matricula){
        setNome(nome);
        this.matricula = matricula;
        this.notas = new ArrayList<>();
    }

    
    public String toString(){
        return getNome() + " - " + matricula;
    //quando mandar o print vai ver esse metodo e transformar o objeto em string
    //isso que vai acabar sendo impresso
    }


    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
}
