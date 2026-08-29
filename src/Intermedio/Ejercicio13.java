package Intermedio;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        int año;

        System.out.printf("Ingresa un año: ");
        año = Leer.nextInt();

        if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}