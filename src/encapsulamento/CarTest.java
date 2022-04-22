package encapsulamento;

public class CarTest {

    public static void main(String[] args) {
        Car ferrari = new Car();

        //ferrari.setModelo("F8 Spider");
        ferrari.setColor("Amarela");
        ferrari.setYear(2022);

        System.out.println("Modelo " + ferrari.getModelo());
        System.out.println("Cor: " + ferrari.getColor());
        System.out.println("Ano: " + ferrari.getYear());

    }
}
