package staticexamples;

public class SalaDeAula {

    private int assentos;
    private boolean isProjetor;
    private static int quantidade;

    public SalaDeAula() {
        SalaDeAula.quantidade++;
    }

    public SalaDeAula(int assentos, boolean isProjetor) {
        this.assentos = assentos;
        this.isProjetor = isProjetor;
        SalaDeAula.quantidade++;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public boolean isProjetor() {
        return isProjetor;
    }

    public void setProjetor(boolean projetor) {
        isProjetor = projetor;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
