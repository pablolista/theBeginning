/*O algoritmo realiza um somatório dos valores da variável i, quando estes são pares.
*/

package modulo2.avaliacao2;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        
        int n = 0, acumulador = 0;
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        n = ent.nextInt();

        for (int i = 0; i<= n; i++) {
            if (i % 2 == 0)
                acumulador += i;
        }
        System.out.printf("Valor acumulado: %d.", acumulador);
        ent.close();
    }
    
}
