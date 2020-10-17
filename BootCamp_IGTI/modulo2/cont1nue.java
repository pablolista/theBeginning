package modulo2;

import java.util.Scanner;

public class cont1nue {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int numero = 0, somatorio = 0;
        
            do{
                System.out.println("Digite nros positivos ou zero para sair.");
                numero = entrada.nextInt();

                if (numero == 18)
                    continue;
                    //o numero 18 vai ativar o if e fazer com que pule o resto do DO (somatorio = somatorio + numero), vai verificar no WHILE e dps volta pro DO

                somatorio = somatorio + numero;

            } while (numero > 0);
            System.out.printf("O somatório é: %d", somatorio);
            entrada.close();
        }
    
    
}
