package Basico;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double radio, area, circunferencia;

        System.out.printf("\n Ingrese el radio del circulo --> ");
        radio = leer.nextDouble();

        area = Math.PI * (radio * radio);
        circunferencia = 2 * Math.PI * radio;

        System.out.printf("\n -- Resultados --");
        System.out.printf("\n El área es: %.2f", area);
        System.out.printf("\n La circunferencia es: %.2f", circunferencia);
    }
}
