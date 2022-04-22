package enums;

public class PizzaTeste {

    StatusPizza status;

    public PizzaTeste() {

    }

    public PizzaTeste(StatusPizza status) {
        this.status = status;
    }

    public void prontaParaEntrega() {
        switch (status) {
            case FAZENDO:
                System.out.println("fafafafa");
                break;
            case PRONTA:
                System.out.println("hmmmmmm");
                break;
            case ENVIADA:
                System.out.println("fhuwhfuie");
                break;
            default:
                System.out.println("nao sabemos o status");
                break;
        }
    }

    public static void main(String[] args) {

        PizzaTeste teste1 = new PizzaTeste(StatusPizza.FAZENDO);
        teste1.prontaParaEntrega();

        PizzaTeste teste2 = new PizzaTeste(StatusPizza.PRONTA);
        teste2.prontaParaEntrega();

        PizzaTeste teste3 = new PizzaTeste(StatusPizza.ENVIADA);
        teste3.prontaParaEntrega();

        PizzaTeste teste4 = new PizzaTeste(StatusPizza.DESCONHECIDO);
        teste4.prontaParaEntrega();

    }

}
