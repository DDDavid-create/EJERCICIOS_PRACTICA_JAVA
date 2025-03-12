package P2;

public class E2 {
    public static void main(String[] args) {
        final double KILOMETROS_A_MILLAS = 0.621371; // Constante de conversión
        double kilometros = 10.0;
        double millas = kilometros * KILOMETROS_A_MILLAS;

        System.out.println(kilometros + " kilómetros equivalen a " + millas + " millas.");
    }
}
