package modulo2.aulaInterativa;

import java.util.Scanner;

public class projeto20201006 {

    public static void main(String[] args) {
        int ano = 0, idade = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o ano em que você nasceu: ");
        ano = entrada.nextInt();

        idade = 2020 - ano;
        System.out.printf("Você nasceu no ano de %d e tem %d anos", ano, idade);
        
        if (idade >= 0 && idade <= 12)
            System.out.println("Você é uma criança.");
        else if (idade > 12 && idade < 18)
            System.out.printf("Você ainda é um adolescente.");
        else if (idade >= 18 && idade < 60)
            System.out.printf("Você já é um adulto");
        else if (idade >= 60)
            System.out.printf("Você está na melhor idade");
        else
            System.out.println("Você ainda não nasceu?");

        entrada.close();
    }
    
}
