package fernandakeeper.intermediario.generics;

import java.util.*;

public class GenericsApp {
    public static void main(String[] args) {
        System.out.println("Hello Generics!");
        /*
        Generics são uma forma de criar classes, interfaces e métodos que operam com tipos genéricos.

        Map -> estrutura de dados que associa chaves a valores.
        Set -> coleção de elementos únicos, sem duplicatas. Ex: [1,2,3,4,5]
        List -> coleção ordenada de elementos, que pode conter duplicatas. Ex: [1,2,3,4,5,5]
        Queue -> estrutura de dados que segue o princípio FIFO (First In, First Out), onde o primeiro elemento adicionado é o primeiro a ser removido.

         */

        // EXEMPLO DE USO DE GENERICS COM LIST
        List<String> list = new ArrayList<>();
        list.add("Fernanda");
        list.add("Fernanda");
        list.add("Natanael");;
        System.out.println(list.get(2)); // Acessando o terceiro elemento da lista;

        // EXEMPLO DE USO DE GENERICS COM SET

        Set<String> set = new HashSet<>();
        set.add("Fernanda");
        set.add("Natanael");
        set.add("Fernanda"); // Não será adicionado, pois o Set não permite duplicatas
        System.out.println(set.size()); // Exibe o tamanho do Set, que será 2
        System.out.println("Lista completa(não deixa ser inserido duplicados): " + set);


        // EXEMPLO DE USO DE GENERICS COM MAP
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Fernanda");
        map.put(2, "Natanael");
        map.put(3, "Fernanda"); // Atualiza o valor associado à chave "Fernanda"
        System.out.println(map.get(2)); // Acessa o valor associado à chave 2, que será Natanael

        // EXEMPLO DE USO DE GENERICS COM QUEUE
        Queue<String> queue = new LinkedList<>();
        queue.add("Fernanda");
        queue.add("Natanael");
        queue.add("Fernanda");
        queue.add("Keeper");
        System.out.println(queue.poll()); // Remove e exibe o primeiro elemento da fila, que será "Fernanda"
        System.out.println(queue.peek()); // Exibe o próximo elemento da fila, que será "Natanael" sem removê-lo
        System.out.println(queue); // Exibe o conteúdo da fila, que será [Natanael, Fernanda, Keeper], pois o primeiro elemento foi removido com poll()

        // EXEMPLO DE USO DE GENERICS COM LINKEDLIST
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Fernanda");
        linkedList.add("Natanael");
        linkedList.addFirst("Holanda"); // Adiciona "Holanda" no início da lista
        System.out.println(linkedList);

    }
}
