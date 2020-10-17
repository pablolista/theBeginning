package modulo2.orientacaoObjetos;

public class genshinPersonagens {

    /*Cria um atributo chamado genshinPersonagens que vai usado em outro arquivo*/
    
    String nome;
    int idade;
    String elemento;
    genshinEndereço origem;//usa o atributo (public class) genshinEndereço para a variavel endereço
    char imprimirEndereco;

    genshinPersonagens(){
        origem = new genshinEndereço();
        /*
        É um construtor sem argumentos. Está indicando que a variavel origem, do atributo (public class) genshinEndereço vai instanciar o arquivo genshinEndereço.
        Quase como se ele CONSTRUISSE uma nova instancia de genshinEndereço para armazenar os dados
        */
    }

    genshinPersonagens(String name, int age, String element){
        nome = name;
        idade = age;
        elemento = element;
        origem = new genshinEndereço();
        /*
        Cria um outro construtor com argumentos.
        ***IMPORTANTE***
        Caso origem = new genshinEnreço(); não fosse instaciado, ele não seria ativado quando esse construtor fosse utilizado.
        Para instanciar esse construtor ao inves do anterior, basta adicionar os elementos pedidos dentro dos parenteses
        
        É possível tbm adicionar os dados da origem no construtor, já que ele cria variáveis e elas são rearranjadas depois, basta continuar instanciando um new genshinEnderço e após isso adicionar as devidas interações (origem.cidade, por exemplo)
        */
    }


    String imprimirgenshinPersonagens() {
        return "Nome: " + nome + ", idade " + Integer.toString(idade) + ", usa o elemento: " + elemento + "\n" + nome + " é de " + origem.imprimirgenshingEndereco();
        /*
        Para imprimir o endereço é necessário acessar a função (ou metodo) imprimirgenshingEndereço() que está no arquivo genshinEndereço.java. Como esse arquivo já foi instaciado antes pela variavel origem, basta acessá-lo
        */
    }

    /*

    AQUI TEMOS UMA OUTRA FORMA DE ABORDAGEM DO QUE FOI APRESENTADO ACIMA.
    A DIFERENÇA ESTÁ NA CRIAÇÃO E INSTANCIAÇÃO DE UMA NOVA VARIAVEL QUE VAI DETERMINAR A EXECUÇÃO OU NÃO DA ESTRUTURA DE DECISÃO QUE VAI DECIDIR SE O ENDEREÇO VAI SER IMPRESSO OU NÃO.
    É necessário que essa variável seja passada dentro do parenteses para execução apropriada, caso contrário da erro
    
    */
    String imprimirgenshinPersonagens(char imprimirEndereco) {
            if (imprimirEndereco == 'N' || imprimirEndereco == 'n')
                return "Nome: " + nome + ", idade " + Integer.toString(idade) + ", usa o elemento: " + elemento;
            else
                return "Nome: " + nome + ", idade " + Integer.toString(idade) + ", usa o elemento: " + elemento + "\n" + nome + " é da " + origem.imprimirgenshingEndereco();
    }

}
