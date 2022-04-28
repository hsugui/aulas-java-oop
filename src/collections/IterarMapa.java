package collections;

import java.util.HashMap;
import java.util.Map;

public class IterarMapa {

    public static void main(String[] args) {

        // Criar mapa
        Map<Integer, String> map = new HashMap<>();

        // Atribuir chaves e valores
        map.put(1, "Muay Thai");
        map.put(2, "Jiu-Jitsu");
        map.put(3, "Judo");
        map.put(4, "Capoeira");
        map.put(5, "Karate");
        map.put(6, "Boxe");

        // Iterar e imprimir
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Iterar e imprimir com Java 8
        System.out.println();
        map.forEach((i, s) -> System.out.println(i + ": " + s));



    }
}
