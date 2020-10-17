package modulo2;

/**
 * ProjetoAula1_6
 */
public class ProjetoAula1_6 {

    public static void main(String[] args) {
        String nome, nome2;
        nome = "José da Silva Costa";
        nome2 = "Maria Clara Souza Almeida";
        //String é sempre aspas duplas, CHAR é sempre aspas simples
        System.out.println(nome);
        System.out.println(nome2);



        int tamanhoDoNome = nome.length(), tamanhoDoNome2 = nome2.length();
        System.out.println("A variavel nome tem " + tamanhoDoNome + " caracteres");
        System.out.println("A variavel nome2 tem " + tamanhoDoNome2 + " caracteres");
        


        int totalCaracteres = tamanhoDoNome +  tamanhoDoNome2;
        System.out.println("O total de caracteres das duas variáveis é: " + totalCaracteres);
        


        String nomesConcatenados = nome.concat(nome2);
        System.out.println(nomesConcatenados);



        String nomeSemA = nome.replace('a', '9');
        //CHAR é sempre aspas simples, STRING é sempre aspas duplas
        System.out.println(nomeSemA);



        String somenteNome = nome2.substring(0, 11);
        System.out.println(somenteNome);



        String nomeTudoMaiusculo = nome.toUpperCase();
        System.out.println(nomeTudoMaiusculo);



        String nomeTudoMinusculo = nome.toLowerCase();
        System.out.println(nomeTudoMinusculo);
    }
}