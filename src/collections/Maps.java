package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Tayna");
        mapa.put(2, "Vitor");
        mapa.put(3, "Weslley");

        System.out.println(mapa);

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        Map<String, Carro> mapaDoido = new HashMap<>();

        carro1.setCor("azul");
        carro1.setNome("fiat");
        carro2.setCor("vermelho");
        carro2.setNome("ferrari");

        mapaDoido.put("A", carro1);
        mapaDoido.put("fehufe", carro2);

//        System.out.println(mapaDoido);
//
//        mapaDoido.forEach((s, carro) -> System.out.println(s + " : " + carro.getNome() + " - " + carro.getCor()));


    }

}
