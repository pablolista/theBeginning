package modulo2.avaliacao1;

import java.util.Scanner;

public class programa3 {

    public static void main(String[] args) {
        double salarioFixo = 3500.00, comissao = 0.05, totalVendas = 0, salarioTotal = 0;
        double auxilioCreche = 450;
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaDouble = new Scanner(System.in);
        String nome;
        char possuiFilhos;

        System.out.println("Digite o nome do vendedor");
        nome = entradaTexto.nextLine();

        System.out.println("O vendedor possui filhos? (S - sim; N - não)");
        possuiFilhos = entradaTexto.nextLine().charAt(0);

        System.out.println("Digite o total de vendas do vendedor: ");
        totalVendas = entradaDouble.nextDouble();

        if (totalVendas >= 40000.00){
            if (possuiFilhos == 'S' || possuiFilhos == 's')
                salarioTotal = salarioFixo + (totalVendas * comissao) + auxilioCreche;
            else
            salarioTotal = salarioFixo + (totalVendas * comissao);
        }
        else{
            if (possuiFilhos == 'S' || possuiFilhos == 's')
                salarioTotal = salarioFixo + auxilioCreche;
                else
                    salarioTotal = salarioFixo;
        }
        System.out.printf("O salário do(a) vendedor(a) %s é de: %.2f.", nome, salarioTotal);

        entradaDouble.close();
        entradaTexto.close();
        
    }
    
}
