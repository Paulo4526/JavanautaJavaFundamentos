package collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsArray {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();

        frutas.add("Pera");
        frutas.add("Melão");
        frutas.add("Mamão");
        frutas.add(1, "Banana"); //Adicionando item na posição do index 1
        System.out.println("Frutas da lista: " + frutas + "\n");

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(2, 5); //Adicionando o número 5 na posição do index 2
        System.out.println("Lista de números da lista: " + numeros + "\n");

        for(String produtos : frutas){
            System.out.println("Iterando as frutas: " + produtos);
        }

        for (Integer listaNumeros: numeros){
            System.out.println("Iterando os números: " + listaNumeros);
        }

        //Funcionalidades
        Integer tamanho = numeros.size(); //Verifica quantos items há dentro da Lista
        boolean contain = numeros.contains(5); //Verifica se o item existe dentro da Lista
        boolean vazio = numeros.isEmpty(); //Verifica se o array está vazio
        frutas.remove("Banana"); //Remove o item dentro do array
        //Iterando com foreach
        frutas.forEach(produtos -> System.out.println("Iterando com forEach: " + produtos));
    }
}
