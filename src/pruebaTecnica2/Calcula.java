package pruebaTecnica2;

public class Calcula extends Mitad {

    public static void main(String[] args) {
        int n1 = 22;
        int n2 = 2;

        Mitad m1 = new Calcula();
        int n3 = m1.calcularMitad(n1, n2);
        System.out.println(n3);
    }

}
