package modulo2;

import java.util.Scanner;


public class test_falta_loop {

    public static void main(String[] args) {
        
        char caractereDigitado, resposta = 'k';
        Scanner entrada =  new Scanner(System.in);

        System.out.println("Tente advinhar uma letra de A a Z:");
        caractereDigitado = entrada.nextLine().charAt(0);
        while (caractereDigitado != resposta){
            System.out.println("Resposta certa");
            caractereDigitado = entrada.nextLine().charAt(0);
        }
        entrada.close();
    }
    
}
