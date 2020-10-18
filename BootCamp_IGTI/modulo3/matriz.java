package modulo3;

import java.util.ArrayList;
import java.util.Arrays;

public class matriz {

    public static void main(String[] args) {
        
        ArrayList<ArrayList<Double>> matriz = new ArrayList<ArrayList<Double>>();

        ArrayList<Double> linha1 = new ArrayList<>();

        linha1.add(8.0);
        linha1.add(10.0);
        linha1.add(7.0);
        linha1.add(6.5);
        matriz.add(linha1);

        ArrayList<Double> linha2 = new ArrayList<Double>(Arrays.asList(7.0, 9.0, 5.0, 4.0));
        ArrayList<Double> linha3 = new ArrayList<Double>(Arrays.asList(4.0, 8.0, 6.0, 9.0));

        matriz.add(linha2);
        matriz.add(linha3);

        System.out.println(matriz);
        System.out.println("Aqui vai acesasr matriz e entrar no array de indice 1 e dentro dele vai buscar o indice 2, que vai retornar: " + matriz.get(1).get(2));

        matriz.get(1).set(2, 10.5);
        //vai no array de indice 1, entra no indice 2 e altera ele para o valor indicado
        System.out.println(matriz);

        for (int i = 0; i < matriz.size(); i++){
            System.out.println(matriz.get(i));

            for (int j = 0; j < matriz.size(); j++){
                System.out.println(matriz.get(i).get(j));
            }

        /*

        TEM O MESMO EFEITO
        
        for (int x = 0; x < matriz.size(); x++){
            ArrayList<Double> linha = matriz.get(i);
            System.out.println(linha);

            for (int y = 0; y < linha.size(); y++){
                System.out.println(linha.get(y));
            }
        }
        */
        }

    }
}
