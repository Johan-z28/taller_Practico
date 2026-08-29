package Intermedio;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        int num1, num2, num3;

        System.out.printf("Ingrese el número 1 --> ");
        num1 = Leer.nextInt();
        System.out.printf("Ingrese el número 2 --> ");
        num2 = Leer.nextInt();
        System.out.printf("Ingrese el número 3 --> ");
        num3 = Leer.nextInt();

        System.out.println("\n-- Resultados --");

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El mayor es: " + num1);
            } else {
                System.out.println("El mayor es: " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("El mayor es: " + num2);
            } else {
                System.out.println("El mayor es: " + num3);
            }
        }

    }
}
