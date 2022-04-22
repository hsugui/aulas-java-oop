package abstracaoheranca;

public class Gato extends Animal implements Amigavel, Dosmesticavel {

    @Override
    void mover() {
        System.out.println("Corre e pula alto.");
    }

    @Override
    void comer() {
        System.out.println("Come rato.");
    }

    @Override
    void caracteristica() {
        System.out.println("ahahaha");
    }

    @Override
    public void fazerCarinho() {
        System.out.println("Gatinho da cabecada");
    }

    @Override
    public void fazerSom() {
        System.out.println("Faz miau");
    }

    @Override
    public void serDomesticavel() {
        System.out.println("oiiiiiiii");
    }
}
