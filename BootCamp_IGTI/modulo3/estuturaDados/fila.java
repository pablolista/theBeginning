package modulo3.estuturaDados;

import java.util.LinkedList;
import java.util.Queue;

public class fila {
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();

        fila.add("Livro 1");
        fila.add("Livro 2");
        fila.add("Livro 3");
        fila.add("Livro 4");
        fila.add("Livro 5");
        //.add adiciona elementos na fila

        System.out.println(fila);


        //.remove remove e retorna elemento de cima da pilha
        System.out.println("O que será removido é o " + fila.remove());
        System.out.println(fila);

        //.peek retorna o elemento da frente da fila
        System.out.println("O que está no topo é o " + fila.peek());
        System.out.println(fila);

        //.contains busca elemento na fila
        System.out.println("Livro 3 está na fila?" + fila.contains("Livro 3"));

        //.clear remove todos elemento da frente da fila
        fila.clear();
        System.out.println(fila);

        //.isEmpty retorna um bool se há ou não elementos
        System.out.println("A fila está vazia? " + fila.isEmpty());
    }
    
}
