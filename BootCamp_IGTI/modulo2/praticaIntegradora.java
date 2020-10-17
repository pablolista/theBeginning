package modulo2;

public class praticaIntegradora {

    public static void main(String[] args) {
        
        double nota1, nota2, nota3, nota4, frequencia, totalNotas;
        String nomeAluno;
        char statusAluno;
        boolean aprovado;

        nomeAluno = "Ana Paula da Silva Couto";
        statusAluno = 'M';

        nota1 = 20;
        nota2 = 20;
        nota3 = 30;
        nota4 = 5;

        frequencia = 0.80;

        totalNotas = nota1 + nota2 + nota3 + nota4;

        aprovado = totalNotas >= 70 && frequencia >= 0.75;

        System.out.printf("Aluno \"%s\" obteve nota final %.2f e frequencia %.0f%%. A situação do aluno é %c.\nAluno Aprovado? %b", nomeAluno, totalNotas, frequencia*100, statusAluno, aprovado);

    }
    
}
