package abstracaoheranca;

public class AnimalTeste {

    public static void main(String[] args) {

        Animal tom = new Gato();

        Gato garfield = new Gato();
        Cachorro pluto = new Cachorro();

        garfield.fazerCarinho();
        garfield.fazerSom();

        tom.caracteristica();
        tom.mover();
        tom.comer();
        tom.fazerCarinho();
        tom.fazerSom();

    }

}
