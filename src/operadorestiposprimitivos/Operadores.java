package operadorestiposprimitivos;

import java.security.spec.RSAOtherPrimeInfo;

public class Operadores {

    public static void main(String[] args) {

        int integer = 6 + 10 * 4 / 2 - 1;
        System.out.println(integer);

        if(integer <= 2 || integer % 2 == 1 && integer > 10) {
            System.out.println("as condicoes do if foram satisfeitas");
        }

        boolean a = true;
        boolean b = false;
        boolean c= false;

        System.out.println(a || b && c);
        System.out.println((a || b) && c);

        int x = 2;
        int result = 0;


    }

}
