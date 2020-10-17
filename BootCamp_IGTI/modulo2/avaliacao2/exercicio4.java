/*Qual será o resultado do algoritmo abaixo se o usuário informar os seguintes valores para a variável n iterativamente: 10, 12, 3, 36, 5, 1, -6?

Valores entre 0 e 10: 4.
Valores entre 11 e 20: 1.
Valores acima de 20: 1.
*/
package modulo2.avaliacao2;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        
        int n = 0;
        int[] valores = new int[3];
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite um valor para n: ");
        n = ent.nextInt();

        while(n >= -1){
            if (n >= 0 && n <= 10)
                valores[0] += 1;
            else if (n >= 11 && n <= 20)
                valores[1] += 1;
            else
                valores[2] += 1;
            System.out.println("Digite um valor para n: ");
            n = ent.nextInt();
        }
        System.out.printf("Valores entre 0 e 10: %d.\nValores entre 11 e 20: %d.\n" + "Valores acima de 20: %d.", valores[0], valores[1], valores[2]);
        ent.close();
    }
}
