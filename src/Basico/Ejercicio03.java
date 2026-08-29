package Basico;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double c, f;

        System.out.printf("Ingrese la temperatura en grados en Celsius --> ");
        c = leer.nextDouble();

        f = (c * 9.0/5.0) + 32;

        System.out.printf("\n -- Resultados ––");
        System.out.printf("\n En grados Fahrenheit es: %.2f", f);

    }
}
