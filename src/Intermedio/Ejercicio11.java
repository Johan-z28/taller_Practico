package Intermedio;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numero;
        String resultado;

        System.out.printf("Ingrese un numero entero --> ");
        numero = leer.nextInt();

        if (numero < 0) {
            resultado = "negativo";
        } else {
            if (numero == 0) {
                resultado = "cero";
            } else {
                if (numero %2 == 0) {
                    resultado = "positivo par";
                } else {
                    resultado = "positivo impar";
                }
            }
        }

        System.out.println("\n-- Resultado --");
        System.out.println("Número ingresado: " + numero);
        System.out.println("Clasificación: " + resultado);
    }
}
