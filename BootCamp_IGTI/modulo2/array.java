package modulo2;

public class array {

    public static void main(String[] args) {
        //tipo [] nome = new tipo [tamanho];
        int [] numeros = new int[5];
        int total = 0;

        numeros[0] = 10;
        numeros[1] = 15;
        numeros[2] = 13;
        numeros[3] = 1;
        numeros[4] = 7;

        total = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];
        System.out.printf("O valor total é: %d", total);
    }
    
}