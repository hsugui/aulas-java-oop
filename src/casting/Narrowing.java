package casting;

public class Narrowing {

    public static void main(String[] args) {

        long l = 100;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;

        double d = 20.4324;
        float f = (float) d;

        System.out.println(l);
        System.out.println(i);
        System.out.println(s);
        System.out.println(b);
        System.out.println(d);
        System.out.println(f);




    }

}
