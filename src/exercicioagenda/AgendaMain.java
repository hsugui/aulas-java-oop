package exercicioagenda;

import java.util.ArrayList;
import java.util.Arrays;

public class AgendaMain {

    public static void main(String[] args) {

        Agenda agenda1 = new Agenda();
        agenda1.armazenarPessoa(8, "Tayna", 26, 1.71);
        agenda1.armazenarPessoa(4, "Vitor", 23, 1.700484);

        System.out.println();
        System.out.println("Array Tamanho: " + agenda1.getPessoas().length);
        Arrays.stream(agenda1.getPessoas()).filter(pessoa -> pessoa != null).forEach(pessoa -> System.out.println(pessoa.getNome()));
        System.out.println("Pessoa no Array: " + agenda1.getPessoas()[8].getNome());
        System.out.println("\n========================\n");

        AgendaArrayList agenda2 = new AgendaArrayList();

        System.out.println("ArrayList: " + agenda2.getList());
        System.out.println();
        agenda2.armazenarPessoa("Tayna", 26, 1.71f);
        System.out.println();
        System.out.println("ArrayList Tamanho: " + agenda2.getList().size());
        System.out.println("Pessoa na ArrayList: " + agenda2.getList().get(0).getNome());

        // agenda2.getList().forEach(pessoa -> System.out.println(pessoa.getNome()));




//        for (Pessoa pessoa : agenda1.getPessoas()) {
//            if (pessoa != null) {
//                System.out.println(pessoa.getNome());
//            } else {
//                System.out.println("null");
//            }
//        }
//        System.out.println();
//
//        agenda1.removerPessoa("xxx");
//
////        System.out.println(agenda1.buscaPessoa("Vitor"));
//
////        agenda1.imprimirPessoa(1);
//
//        for (Pessoa pessoa : agenda1.getPessoas()) {
//            if (pessoa != null) {
//                System.out.println(pessoa.getNome());
//            } else {
//                System.out.println("null");
//            }
//        }
    }
}
