package modulo3.orientacaoObjetos.ControleNotas.entidades;

public class Nota {

    private Materia materia;
    private Double nota;

    public String toString(){
        return materia.getNome() + " - " + nota;
    }
    //quando mandar o print vai ver esse metodo e transformar o objeto em string
    //isso que vai acabar sendo impresso

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
    
}
