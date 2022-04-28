package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaLista {

    public static void main(String[] args) {

        // Criar lista
        List<String> list = new ArrayList<>();

        // Adicionar elementos na lista
        list.add("Volkswagen");
        list.add("Toyata");
        list.add("Porsche");
        list.add("Ferrari");
        list.add("Mercedes-Benz");
        list.add("Audi");
        list.add("Rolls-Royce");
        list.add("BMW");

        // Ordenação padrão
//        Collections.sort(list);
        System.out.println(list);

        // Ordenacao com Comparator em nova classe
//        Comparator<String> comparator = new ComparaPorTamanho();
//        Collections.sort(list, comparator);
//        System.out.println(list);

        // Ordenacao com Comparator em classe anonima
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s2.length() - s1.length();
//            }
//        });
//        System.out.println(list);

        // Ordenacao com Java 8 (lambda)
//        Collections.sort(list, (s1, s2) -> s1.length() - s2.length());
//        System.out.println(list);


        // Imprimir lista (ordem natural)
        //list.forEach(s -> System.out.println(s));

        // Ordenar a lista
        Collections.reverse(list);
       // list.forEach(s -> System.out.println(s));
        Collections.sort(list);

        // Imprirmir em order alfabética
        System.out.println();
        //list.forEach(s -> System.out.println(s));

        List<Integer> list2 = new ArrayList<>();
        list2.add(400);
        list2.add(100);
        list2.add(3095);
        list2.add(-243);
        list2.add(0);

        for (Integer integer : list2) {
           // System.out.println(integer);
        }

    }
}

class ComparaPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return 1;
        } else if (s1.length() < s2.length()) {
            return -1;
        } else {
            return 0;
        }
    }

}
