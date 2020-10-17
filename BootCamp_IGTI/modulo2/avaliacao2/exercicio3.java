/*
Qual será o resultado do algoritmo abaixo se o usuário informar o valor inteiro 30 para n?

O programa entrará em loop infinito.
Condição do while sempre será true porq 30 sempre será maior que -1 e não há condição para mudar isso
*/

package modulo2.avaliacao2;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        
        int n = 0;
        int[] valores = new int[3];
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite um valor para n: ");
        n = ent.nextInt();

        while (n >= -1){
            if (n >= 0 && n <= 10)
                valores[0] += 1;
            else if (n >= 11 && n <= 20)
                valores[1] += 1;
            else
                valores[2] += 1;
        }
        System.out.printf("Valores entre 0 e 10: %d.\n Valores entre 11 e 20: %d.\n" + "Valores acimma de 20: %d.", valores[0], valores[1], valores[2]);
        ent.close();
    }
    
}