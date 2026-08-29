package Basico;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        int numero;
        String resultado = "";

        System.out.printf("Ingresa un número entero --> ");
        numero = Leer .nextInt();

        if (numero % 2 == 0 ) {
            resultado = "Par";
        } else {
            resultado = "Impar";
        }

        System.out.println("\n -- Resultados --");
        System.out.println("\nEl número ingresado es: " + numero);
        System.out.println("Es un número: " + resultado);
    }
}
