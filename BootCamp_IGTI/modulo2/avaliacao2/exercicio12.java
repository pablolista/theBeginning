//Dado o programa Java abaixo, responda:
//A variável resultado, irá armazenar true se:
//O valor da variável n1 for par.

package modulo2.avaliacao2;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        int n1 = 0;
        boolean resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        n1 = entrada.nextInt();

        resultado = (n1 %2 ==0);
        System.out.printf("O número digitado foi: %d. O resultado da operação booleana foi: %b.", n1, resultado);
        entrada.close();
    }
    
}
