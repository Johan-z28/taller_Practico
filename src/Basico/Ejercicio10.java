package Basico;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double nota;
        String estado;

        System.out.printf("Digite la nota final (0 a 5): ");
        nota = leer.nextDouble();

        if (nota >= 3.0) {
            estado = "aprobado";
        } else {
            estado = "reprobado";
        }

        System.out.println("\n-- Resultado --");
        System.out.println("La nota final: " + nota);
        System.out.println("Estado: " + estado);
    }
}
