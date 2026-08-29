package Basico;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numero;
        String resultado = "";

        System.out.printf("Ingresa un número --> ");
        numero = leer.nextInt();

        if (numero == 0) {
            resultado = "0";
        } else if (numero >= 1) {
            resultado = "positivo";
        } else {
            resultado = "negativo";
        }

        System.out.println("\n -- Resultados --");
        System.out.println("Número ingresado: " + numero);
        System.out.println("El número es: " + resultado);

    }
}
