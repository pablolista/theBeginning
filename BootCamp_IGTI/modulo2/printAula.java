package modulo2;

public class printAula {
    
    public static void main(String[] args) {

        int idade = 30;
        double altura = 1.84;
        String nome = "Joaquim Jose da Silva";
        boolean estudande = true;
        char sexo = 'm';

        //%s String
        //%d Int
        //%.2f Float ou Double com duas casas decimais (p/ mais casas, mudar o numero pós ponto)
        //%b boolean
        //%c Caractere (char)

        System.out.printf("A idade é %d, a altura é %.2f e o nome é %s do sexo %c.\nÉ estudante? %b", idade, altura, nome, sexo, estudande);
        //"\n" pula linha


        //System.out.println("idade: " + idade + " anos");
        //System.out.print("Altura: " + altura);
        //usando os dois system dessa forma ele vai imprimir o primeiro, pular uma linha "ln" e na linha de baixo vai imprimir o segundo
    }
}
