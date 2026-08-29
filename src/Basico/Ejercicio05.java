package Basico;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double calificaciones1 = 0, calificaciones2 = 0, calificaciones3 = 0,  promedio = 0;

        System.out.println("Ingrese la calificación #1");
        calificaciones1 = leer.nextDouble();
        System.out.println("Ingrese la calificación #2");
        calificaciones2 = leer.nextDouble();
        System.out.println("Ingrese la calificación #3");
        calificaciones3 = leer.nextDouble();

        promedio = (calificaciones1 + calificaciones2 + calificaciones3) / 3.0;

        System.out.println("\n -- Resultados --");
        System.out.printf("El promedio es: %.1f", promedio);

    }
}
