package Intermedio;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor, descuento, valorFinal;

        System.out.printf("Ingrese el valor de la compra: ");
        valor = sc.nextDouble();

        if (valor < 50000) {
            descuento = 0.0;
        } else if (valor > 50001 && valor <= 150000) {
            descuento = 0.05;
        }  else if (valor > 150001 && valor <= 300000) {
            descuento = 0.10;
        } else {
            descuento = 0.15;
        }

        valorFinal = valor - (valor * descuento);

        System.out.println("\n-- Resultados --");
        System.out.printf("Valor final: $" + valorFinal);
        System.out.println("\nDescuento aplicado: " + descuento);
    }
}
