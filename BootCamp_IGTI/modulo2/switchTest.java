package modulo2;

import java.util.Scanner;

public class switchTest {
    public static void main(String[] args) {
        char operacao = ' ';
        Scanner ent = new Scanner(System.in);
        double total = 0, n1 = 0, n2 = 0;

        System.out.print("Digite o valor do primeiro número: ");
        n1 = ent.nextInt();

        System.out.print("Digite o valor do segundo número: ");
        n2 = ent.nextInt();

        ent.nextLine();
        System.out.println("Digite a operação desejada (+, -, /, *, %): ");
        operacao = ent.nextLine().charAt(0);

        switch (operacao){
            case '+':
                total = n1 + n2;
                break;
            case '-':
                total = n1 - n2;
                break;
            case '/':
                total = n1 / n2;
                break;
            case '*':
                total = n1 * n2;
                break;
            case '%':
                total = n1 % n2;
                break;
            default:
                System.out.println("Operação desconhecida");
        }
        if (operacao == '+' || operacao == '-' || operacao == '/' || operacao == '*' || operacao == '%')
        System.out.printf("%.2f %c %.2f = %.2f", n1, operacao, n2, total);
        ent.close();
    }
    
}
