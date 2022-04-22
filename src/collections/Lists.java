package collections;

import encapsulamento.Car;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        // Array
        String[] stringArray = new String[10];
        stringArray[3] = "Tayna";
//        for (int i = 0; i < stringArray.length; i++) {
//            System.out.println(stringArray[i]);
//        }

//        int[] intArray = {20, 24, 25, 19, 15};
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
//        }

        // ArrayList
        String weslley = "Weslley";
        String vitor = "Vitor";
        String tayna = "Tayna";

        List<String> arraylist = new ArrayList<>();

        arraylist.add(weslley);
        arraylist.add(vitor);
        arraylist.add(tayna);
        arraylist.add("Henrique");

        arraylist.remove(0);

//        arraylist.forEach(s -> System.out.println(s));

        Integer i1 = 10;
        Integer i2 = 20;
        Integer i3 = 2050;
        Integer i4 = -24;
        Integer i5 = 0;

        List<Integer> inteiros = new ArrayList<>();
        inteiros.add(i1);
        inteiros.add(i2);
        inteiros.add(i3);
        inteiros.add(i4);
        inteiros.add(i5);
        inteiros.add(2000);

        List<Carro> carros = new ArrayList<>();
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.setCor("azul");
        carro1.setNome("fiat");
        carro2.setCor("vermelho");
        carro2.setNome("ferrari");

        carros.add(carro1);
        carros.add(carro2);

        System.out.println(carros);
        carros.forEach(carro -> System.out.println(carro.getCor() + " : " + carro.getNome()));

    }

}
