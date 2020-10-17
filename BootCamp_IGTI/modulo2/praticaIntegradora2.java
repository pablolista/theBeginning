package modulo2;

import java.util.Scanner;

public class praticaIntegradora2 {

    public static void main(String[] args) {
        
        char operacao = ' ';
        int[] numeros = new int[1000];
        int i = 0;
        int somatorio = 0;
        int contaPares = 0;
        double media = 0;
        Scanner entCaracter = new Scanner(System.in);
        Scanner entNumeros = new Scanner(System.in);

        do{
            System.out.printf("Menu de opções.\nD - para digitar novos números.\nZ - para apresentar o somatório dos números.\nV - para visualizar todos os números digitados.\nP - para a quantidade de números digitados.\nM - para a média simples dos números digitados.\nQ - para a quantidade de pares.\nS - para sair\n");

            operacao = entCaracter.nextLine().charAt(0);

            switch (operacao) {
                case 'D':
                    System.out.println("Digite o número desejado: ");
                    numeros[i] = entNumeros.nextInt();
                    i++;
                    break;

                case 'Z':
                    for (int j = 0; j < i; j++){
                        somatorio = somatorio + numeros[j];
                    }
                    System.out.printf("O somatorio do numero é: %d\n", somatorio);
                    break;

                case 'V':
                    for (int j = 0; j < i; j++){
                        System.out.printf("%d\n", numeros[j]);
                    }
                    break;

                case 'P':
                    System.out.printf("Foram digitados %d números\n", i);
                    break;

                case 'M':
                    for (int j = 0; j < i; j++){
                        somatorio = somatorio + numeros[j];
                    }
                    media = somatorio / i;
                    System.out.printf("Media é: %.2f\n", media);
                    break;

                case 'Q':
                    for (int j = 0; j < i; j++){
                        if (numeros[j] % 2 == 0);
                            contaPares++;
                    }
                    System.out.printf("Quantidade de numeros pares: %d\n", contaPares);
                    break;

                case 'S':
                    break;

                default:
                    System.out.println("Opção invalida");
            }

        } while(operacao != 'S');
        
        System.out.println("Já deu. né?");
        
        entCaracter.close();
        entNumeros.close();
    }
    
}
