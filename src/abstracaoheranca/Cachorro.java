package abstracaoheranca;

public class Cachorro extends Animal {

    @Override
    void mover() {
        System.out.println("Corre e eh bobo.");
    }

    @Override
    void comer() {
        System.out.println("Come racao.");
    }

    @Override
    public void fazerCarinho() {

    }

    @Override
    public void fazerSom() {

    }
}
