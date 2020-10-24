package modulo3.orientacaoObjetos.ControleNotas.entidades;

import java.util.ArrayList;

public class Aluno extends Pessoa {

    private Integer matricula;
    private ArrayList<Nota> notas;

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
