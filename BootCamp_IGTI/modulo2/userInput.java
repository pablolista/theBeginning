package modulo2;

import java.util.Scanner;

public class userInput {

    public static void main(String[] args) {
        
        double nota1, nota2, nota3, nota4, frequencia, totalNotas;
        char statusDoAluno;

        Scanner entradaNotas = new Scanner(System.in);
        Scanner entradaCaractere = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = entradaCaractere.nextLine();
        //usa o Scanner entradaCaractere pra registrar a string digitada no input e jogar na var nomeAluno

        System.out.print("Digite um caractere para a situação do aluno (O --> Ok; P --> Pendência): ");
        statusDoAluno = entradaCaractere.nextLine().charAt(0);
        //usa o Scanner entradaCaractere pra registrar a string digitada e jogar na var statusDoAluno, entretanto, o '.charArt(0)' faz com que pegue somente o primeiro index da linha digitada. Por isso a var statusDoAluno foi registrada como 'char' porq ela só vai armazenar UM caractere

        System.out.print("Digite a primeira nota: ");
        nota1 = entradaNotas.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = entradaNotas.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = entradaNotas.nextDouble();

        System.out.print("Digite a quarta nota: ");
        nota4 = entradaNotas.nextDouble();

        System.out.print("Digite a frequencia do aluno: ");
        frequencia = entradaNotas.nextDouble();
        //todos esses pedidos de input vão ser armazenaddos como doubles porq são notas e e assim que essas coisas funcionam. Voc já foi pra escola, sabe como é tirar aquele 95.5... KEKW

        totalNotas = nota1 + nota2 + nota3 + nota4;

        boolean aprovado = totalNotas >= 70 && frequencia >= 0.75;

        System.out.printf("O aluno \"%s\" obteve nota final %.2f e frequência %.2f%%.\nA situação no aluno é: %c\nAluno aprovado? %b", nomeAluno,  totalNotas,  frequencia*100, statusDoAluno, aprovado);
        
        entradaCaractere.close();
        entradaNotas.close();
    }
    
}
