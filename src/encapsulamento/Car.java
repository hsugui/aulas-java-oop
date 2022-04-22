package encapsulamento;

public class Car {

    public final String modelo = "F8 Turbo";
    private String color;
    private int year;
    protected String x;
    String y;

    public String getModelo() {
        return modelo;
    }

//    public void setModelo(String modelo) {
//        this.modelo = modelo;
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}