/*
Sabemos que o programa Java abaixo permite que o usuário informe diversos números inteiros para que estes sejam armazenados dentro de um vetor de, no máximo, 50 posições. Como poderíamos complementar esse programa para que os dados do vetor possam ser armazenados em um arquivo texto?

 try {
    FileWriter arq = new FileWriter("F:\\BootCamp_IGTI\\modulo2\\avaliacao2\\arqAvaliacao7.txt");
    PrintWriter gravarArquivo = new PrintWriter(arq);
    for (int i = 0; i < contaNros; i++){
        gravarArquivo.printf("%d\n", numeros[i]);
    }
    arq.close();
    gravarArquivo.close();
    System.out.println("Processo finalizado.");
    }
    catch (IOException e) {
        System.out.println("Erro gravando dados:: " + e.getMessage());
    }
*/
package modulo2.avaliacao2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[50];
        int contaNros = 0;
        char continuar = 'S';
        while (continuar == 'S' || continuar == 's'){
            System.out.printf("Digite o %dº número:\n", contaNros+1);
            numeros[contaNros] = entrada.nextInt();
            contaNros++;
            entrada.nextLine();
            System.out.println("Deseja continuar digitando números (S - sim, N - não)?");
            continuar = entrada.nextLine().charAt(0);
        }
        try {
            FileWriter arq = new FileWriter("F:\\Programing\\BootCamp_IGTI\\modulo2\\avaliacao2\\arqAvaliacao7.txt");
            PrintWriter gravarArquivo = new PrintWriter(arq);
            for (int i = 0; i < contaNros; i++){
                gravarArquivo.printf("%d\n", numeros[i]);
            }
            arq.close();
            gravarArquivo.close();
            System.out.println("Processo finalizado.");
        }
        catch (IOException e) {
            System.out.println("Erro gravando dados:: " + e.getMessage());
        }
        entrada.close();
    }
    
}
