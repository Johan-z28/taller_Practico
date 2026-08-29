package Basico;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        final double tasa = 3169.59;
        double valor, dolares;

        System.out.printf("Ingrese valor en pesos a cambiar --> ");
        valor = Leer.nextDouble();

        dolares = valor / tasa;

        System.out.println("\n -- Resultados --");
        System.out.printf("El monto en dólares es: %.2f", dolares);

    }
}
