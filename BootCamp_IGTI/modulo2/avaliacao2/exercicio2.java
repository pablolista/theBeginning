/*
Dado o código Java abaixo, escolha a opção que representa a saída do algoritmo, caso o usuário informe o valor 20 para a variável n:

O algoritmo irá imprimir todos os valores positivos de i de forma decrescente e o valor da variável contador, que será 6.
*/

package modulo2.avaliacao2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        
        int n = 0, contador =0;
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        n = ent.nextInt();

        for (int i = n; i> 0; i--) {
            System.out.printf("Valor de i: %d.\n", i);
            if (i % 3 == 0)
                contador += 1;
        }
        System.out.printf("Valor da variável contador: %d.", contador);
        ent.close();
    }
}
