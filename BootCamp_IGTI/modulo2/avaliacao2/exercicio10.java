//Qual o objetivo do programa Java apresentado abaixo?
//Apresentar números primos entre 1 e 100

package modulo2.avaliacao2;

public class exercicio10 {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 100; i++){
            contador = 0;
            for (int j = i; j > 0; j--) {
                if (i % j == 0)
                    contador++;
            }
            if (contador == 2)
                System.out.printf("%d\n", i);
        }
    }
    
}
