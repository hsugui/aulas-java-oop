package equalshashcode;

public class EqualsAndHashcode {

    public static void main(String[] args) {

        String s1 = "HILDO";
        String s2 = "HILDO";
        String s3 =  new String("HILDO");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true

    }

}

// == é operador e é usado para comparação de referência (endereço de memória)
// equals() é um método que é usado para comparar o CONTEÚDO