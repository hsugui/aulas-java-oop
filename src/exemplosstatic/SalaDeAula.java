package exemplosstatic;

public class SalaDeAula {

    private int qtdAssentos;
    private boolean isProjetor;
    private int qtdSalas;

//    public SalaDeAula() {
//        qtdSalas++;
//    }
//
//    public SalaDeAula(int qtdAssentos, boolean isProjetor) {
//        this.qtdAssentos = qtdAssentos;
//        this.isProjetor = isProjetor;
//        qtdSalas++;
//    }
//
//    public SalaDeAula(int qtdAssentos, boolean isProjetor, int qtdSalas) {
//        this.qtdAssentos = qtdAssentos;
//        this.isProjetor = isProjetor;
//        this.qtdSalas = qtdSalas;
//    }

    public int getQtdAssentos() {
        return qtdAssentos;
    }

    public void setQtdAssentos(int qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }

    public boolean isProjetor() {
        return isProjetor;
    }

    public void setProjetor(boolean projetor) {
        isProjetor = projetor;
    }

    public int getQtdSalas() {
        return qtdSalas;
    }

    public void setQtdSalas(int qtdSalas) {
        this.qtdSalas = qtdSalas;
    }
}
