package pruebaTecnica3;

public class Main {

    public static void main(String[] args) {
        /*int x = 0;
        do {
            System.out.println(x);
            x++;
        } while (x < 10);

        System.out.println();
        System.out.println("salto");
        System.out.println();

        int y = 0;
        while (y < 10) {
            System.out.println(y);
            y++;
        }

        System.out.println();
        System.out.println("salto");
        System.out.println();
        */

        /*String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));*/

        System.out.println("a");
        try {
            System.out.println("b");
            throw new IllegalArgumentException();
        } catch (RuntimeException e) {
            System.out.println("c");
        } finally {
            System.out.println("d");
        }
        System.out.println("e");


    }

    public static int max(double[] array) {

        return array.length-1;
    }
}
