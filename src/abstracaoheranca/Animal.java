package abstracaoheranca;

public abstract class Animal implements Amigavel {

    abstract void mover();
    abstract void comer();

    void caracteristica() {
        System.out.println("Caracteristicas do animal:");
    }

}
