package modulo3.estuturaDados;

import java.util.ArrayList;

public class lista {

    public static void main(String[] args) {
        ArrayList<String> valWeapon = new ArrayList<String>();
        valWeapon.add("Phantom");
        valWeapon.add("Vandal");
        valWeapon.add("Ghost");
        //.add adiciona item no array. Se não foi passado indice, ele vai pro final, se nao vai no indice indicado

        valWeapon.add(2, "Classic");
        //agora Ghost é o último item da lista

        System.out.println(valWeapon);
        for(int i = 0; i < valWeapon.size(); i++){
            //.size é de acordo com o tamnho
            System.out.println(valWeapon.get(i));
            //.get é pegar elemento
        }




        System.out.println("\nAgora procurando um item no meio da lista usando .indexOf\n");

        if (valWeapon.contains("Ghost")){
            //.contains vai verificar se determinado item existe na lista
            System.out.printf("Ghost existe no array e é o item %d\n", valWeapon.indexOf("Ghost")+1);
            //.indexOf vai retornar o valor de indíce da 1ª vez que o item aparece.
            //Valor de indice != posição na lista, já que os indíces começam em 0
        }
        else{
            System.out.println("Ghost não existe no array");
        }




        System.out.println("\nAgora procurando um item duplicado no meio da lista usando .lastIndexOf\n");

        valWeapon.add("Ghost");

        if (valWeapon.contains("Ghost")){
            //.contains vai verificar se determinado item existe na lista
            System.out.printf("Ghost existe no array e é o item %d\n", valWeapon.lastIndexOf("Ghost")+1);
            //.lastIndexOf vai retornar o valor de indíce da última vez que o item aparece.
            //Valor de indice != posição na lista, já que os indíces começam em 0
        }
        else{
            System.out.println("Ghost não existe no array");
        }




        System.out.println("\nAgora removendo um item no meio da lista\n");

        valWeapon.remove(1);
        //.remove remove item da lista
        for(int i = 0; i < valWeapon.size(); i++){
            //.size é de acordo com o tamnho
            System.out.println(valWeapon.get(i));
            //.get é pegar elemento
        }



        
        System.out.println("\nAgora trocando item específico da lista\n");
        valWeapon.set(3, "Operator");
        System.out.println(valWeapon);




        System.out.println("\nAgora removendo todos os itens da lista\n");

        valWeapon.clear();
        System.out.println(valWeapon);
    }
    
}
