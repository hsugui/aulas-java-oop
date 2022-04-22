package modificadores;

public class Cerveja extends Bebiba {

    public String marca;
    private double teorAlcoolico;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }
}
