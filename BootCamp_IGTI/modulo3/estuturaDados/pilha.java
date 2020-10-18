package modulo3.estuturaDados;

import java.util.Stack;

public class pilha {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();


        stack.add("Livro 1");
        stack.add("Livro 2");
        stack.add("Livro 3");
        stack.add("Livro 4");
        stack.add("Livro 5");
        //.add adiciona elementos no empilhamento

        System.out.println(stack);


        //.pop remove e retorna elemento de cima da pilha
        System.out.println("O que será removido é o " + stack.pop());
        System.out.println(stack);

        //.peek retorna o elemento de cima da pilha
        System.out.println("O que está no topo é o " + stack.peek());
        System.out.println(stack);

        //.search busca elemento no empilhamento
        System.out.println("Livro 3 está no indice " + stack.search("Livro 3"));

        //.isEmpty retorna um bool se há ou não elementos
        System.out.println("A pilha está vazia? " + stack.isEmpty());
    }
}
