package modulo2;

import java.util.Scanner;

public class loopTest {
    public static void main(String[] args) {
        
        int i = 0, j = 0;
        char saida = 'N';
        Scanner ent = new Scanner(System.in);

        System.out.println("é noix");
        for (i = 0; i < 10; i++){
            System.out.printf("Valor de i = %d\n", i);
            for (j = 0; j < 5; j++){
                System.out.printf("    Valor de j = %d\n", j);
            }
        }

        while (saida != 'S'){
            System.out.println("Gostaria de sair? (S - sim, N - não");
            saida = ent.nextLine().charAt(0);
        }

        System.out.println("cabo");
    }
    
}
