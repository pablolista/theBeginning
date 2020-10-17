/*
Dado o programa Java abaixo, podemos substituir a estrutura de repetição “for”, sem alteração nos resultados, pela seguinte opção:

        while (i < 10){
            System.out.println("Digite números: ");
            n = entrada.nextInt();
            somador = somador + n;
            i++;
*/
package modulo2.avaliacao2;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        int n = 0, somador = 0;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.println("Digite números: ");
                n = entrada.nextInt();
                somador = somador + n;
        }
        System.out.printf("O valor somado é: %d.", somador);

        int i = 0;
        somador = 0;
        while (i < 10){
            System.out.println("Digite números: ");
            n = entrada.nextInt();
            somador = somador + n;
            i++;
        }
        System.out.printf("O valor somado é: %d.", somador);
        entrada.close();
    }
    
}
