package wrapper;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;

public class AutoUnboxing {

    public static void main(String[] args) {

        int a = 50;
        Integer a2 = a;
        System.out.println(a2);


        Integer b = 100;
        int b2 = b;
        System.out.println(b2);

        Integer c = 200;
        Integer d = 200;
        System.out.println(c == d);

        Integer e = 123;
        Integer f = 123;
        System.out.println(e == f);
        //  -128 and 127

        int g = 2000;
        int h = 2000;
        System.out.println(g == h);

        Integer i = Integer.MAX_VALUE;
        System.out.println(i);

        BigInteger bigInteger;
        BigDecimal bigDecimal;
        AtomicInteger atomicInteger;


    }
}
