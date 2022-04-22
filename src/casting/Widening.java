package casting;

public class Widening {

    public static void main(String[] args) {

        byte b = 10;
        short s = b;
        int i = s;
        long l = i;

        float f = 5.5f;
        double d = f;

        System.out.println("byte = " + b);
        System.out.println("short = " + s);
        System.out.println("int = " + i);
        System.out.println("long = " + l);
        System.out.println("float = " + f);
        System.out.println("double = " + d);

        double d2 = i;
        System.out.println(d2);

    }

}
