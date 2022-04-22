package staticexamples;

public class Main {

    public static void main(String[] args) {

        SalaDeAula sala1 = new SalaDeAula();
        sala1.setAssentos(100);
        sala1.setProjetor(true);

        System.out.println(sala1.getAssentos());
        System.out.println(sala1.isProjetor());
        System.out.println(SalaDeAula.getQuantidade());

        SalaDeAula sala2 = new SalaDeAula(200, false);

        System.out.println(sala2.getAssentos());
        System.out.println(sala2.isProjetor());
        System.out.println(SalaDeAula.getQuantidade());
    }

}
