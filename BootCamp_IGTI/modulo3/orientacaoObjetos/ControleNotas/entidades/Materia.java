package modulo3.orientacaoObjetos.ControleNotas.entidades;

public class Materia {

    private String nome;
    private Professor professor;

    public String toString(){
        return nome + " - " + professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
}
