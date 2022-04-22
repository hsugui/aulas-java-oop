package polimorfismo;

public class Jogador {

    // Overloading

    public void jogar() {
        System.out.println("O jogador esta jogando.");
    }

    public void jogar(String esporte) {
        System.out.println("O jogador esta jogando " + esporte + ", pois eh a sua especialidade.");
    }

    public void jogar(String esporte, int oponentes) {
        System.out.println("O jogador esta jogando " + esporte + " contra " + oponentes + " pessoas.");
    }

}
