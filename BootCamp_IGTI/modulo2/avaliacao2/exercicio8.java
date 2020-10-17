/*
Sabemos que o programa Java abaixo permite que o usuário informe diversos números inteiros para que estes sejam armazenados dentro de um vetor de, no máximo, 50 posições. Como poderíamos complementar esse programa para que seja impresso na tela apenas os valores que são múltiplos de 3?

        for (int i = 0; i < contaNros; i++){
            System.out.printf("%d\n", numeros[i]);
        entrada.close();
        }
*/
package modulo2.avaliacao2;

import java.util.Scanner;

public class exercicio8 {
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
            System.out.println("Deseja continuar digitando números? (S para sim)");
            continuar = entrada.nextLine().charAt(0);
        }
        for (int i = 0; i < contaNros; i++){
            System.out.printf("%d\n", numeros[i]);
        entrada.close();
        }
    }
    
}
