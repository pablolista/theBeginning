package modulo2.orientacaoObjetos;

public class genshinEndereço {
    
    /*Cria o atributo chamado genshinEndereço que vai ser instanciado em outro arquivo.
    Atributos primitivos são - char, int, double, etc. Os criados não são primitivos*/

    String cidade;
    String deus;
    int distancia;



    /*Cria uma função (em java tbm chamado de método) que vai ser usado em outro arquivo*/
    String imprimirgenshingEndereco(){
        return "cidade de " + cidade + ", adora o deus " + deus + ". Essa cidade fica a " + Integer.toString(distancia) + " km de distância.\n";
    }

}
