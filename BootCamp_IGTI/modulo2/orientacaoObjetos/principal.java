package modulo2.orientacaoObjetos;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        
        genshinPersonagens p1 = new genshinPersonagens();
        //Aciona o construtor sem parametro em genshinPersonagens e cria p1
        Scanner entCaracter = new Scanner(System.in);
        Scanner entNumero = new Scanner(System.in);
        char imprimirEndereco;

        System.out.println("Digite o nome do personagem: ");
        p1.nome = entCaracter.nextLine();

        System.out.println("Digite a idade do personagem: ");
        p1.idade = entNumero.nextInt();

        System.out.println("Digite o elemento do personagem: ");
        p1.elemento = entCaracter.nextLine();

        System.out.println("Digite a cidade de origem do personagem: ");
        p1.origem.cidade = entCaracter.nextLine();

        System.out.println("Digite a distancia ate essa cidade: ");
        p1.origem.distancia = entNumero.nextInt();

        System.out.println("Digite o deus dessa cidade: ");
        p1.origem.deus = entCaracter.nextLine();


        System.out.printf("\n%s\n", p1.imprimirgenshinPersonagens());

        /*
                                IMPORTANTE

        Aqui estou instanciando imprimirgenshinPersonagens() SEM PARAMETROS NO CONSTRUTOR.

        SÓ FUNCIONA PORQ EM genshinPersonagens EXISTE ESSE CONSNTRUTOR SEM PARAMETROS. TRANSFORMEI ELE EM ANOTAÇÃO E AQUI INDICOU ERRO, MESMO COM O CONSTRUTOR COM PARÂMETRO EXISTINDO.
        */

        System.out.println("\nFim de criação da Personagem1");




        genshinPersonagens p2 = new genshinPersonagens("Lisa", 25, "Eletro");
        //aciona o construtor com parametros em genshinPersonagens e cria p2
        p2.origem.cidade = "Moonstat";
        p2.origem.deus = "Anemo";
        p2.origem.distancia = 50;

        System.out.println("\nPersonagem2 criada conforme parâmetros pré-estabelecidos\n");
        

        System.out.println("Deseja imprimir dados da Personagem2 com endereço?");
        imprimirEndereco = entCaracter.nextLine().charAt(0);

        System.out.printf("\n%s\n", p2.imprimirgenshinPersonagens(imprimirEndereco));
         /*
            IMPORTANTE
        Aqui estou instanciando imprimirgenshinPersonagens() COM PARAMETROS NO CONSTRUTOR.

            Não necessariamente o nome deveria ser o mesmo do que consta em genshinPersonagens.java. Fiz o teste e posso chamar do que quiser, o importante é indicar que será utilizado um parâmetro (e que o parametro seja correto) no construtor para que ele funcione.

            Ex.: poderia chamar de X aqui e ainda fundionaria
        */


    entCaracter.close();
    entNumero.close();

    }
}
