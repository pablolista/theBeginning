/*
Dado o programa Java abaixo que preenche um vetor de números inteiros com valores informados pelo usuário, escolha a opção que imprime esse mesmo vetor na tela, porém em ordem decrescente de seus itens (do último para o primeiro elemento).

 for (int j = 9; j >= 0; j--)
    System.out.printf("%dº elemento. Valor: %d\n", j+1, numeros[j]);
*/
package modulo2.avaliacao2;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.printf("Digite o %dº número: \n", i+1);
            numeros[i] = ent.nextInt();
        }

        for (int j = 9; j >= 0; j--)
            System.out.printf("%dº elemento. Valor: %d\n", j+1, numeros[j]);
        ent.close();
    }
    
}
