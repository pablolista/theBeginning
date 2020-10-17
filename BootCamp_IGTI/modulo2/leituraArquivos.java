package modulo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leituraArquivos {

    public static void main(String[] args) {
        
        try {

            FileReader arquivo = new FileReader("F:\\Programing\\BootCamp_IGTI\\modulo2\\arquivoDados");
            //FileReader vai pegar o arquivo, nao ler
            BufferedReader lerArquivo = new BufferedReader(arquivo);
            //BufferedReader vai ler ele

            String linha;
            //essa variavel string que vou colocar pra armazenar os dados do arquivo
            linha = lerArquivo.readLine();
            //aqui to so especificando que linha vai ser igual a variavel que o BufferReader rodou e que vai ser a linha toda. esse readLine poderia ser outra variante pra ler char, por exemplo.

            while (linha != null){
                //esse while ta aqui pra nao deixar ele ler só uma linha. ele vai rodar enquanto as linhas forem diferentes de nula
                System.out.printf("%s\n", linha);
                //aqui ele vai imprimir o que esta na variavel linha (linha 20)
                linha = lerArquivo.readLine();
                //como consequencia do while aqui ele vai pular pra proxima linha e ler ela, ai vai pra linha de cima, que é pra imprimir, e vai ser outra linha e vai assim até a linha ser nula
            }

            lerArquivo.close();
            arquivo.close();
            //nesse ponto já acabei de fazer o que qria com o arquivo, entao posso apagar o que  tinha nessas variaveis que nao vao ser mais utilizadas pra liberar mais espaço em memoria

        } catch (IOException e){
            //aqui é caso tenha algum tipo de erro. IOException vai pegar o erro e jogar na variavel E
            System.out.println("Erro lendo dados: " + e.getMessage());
            //aqui vai imprimir essa mensaginha com o erro que deu na tentativa de acessar o arquivo
        }
    }
    
}
