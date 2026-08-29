package Basico;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double base, altura, area, perimetro;

        System.out.printf("Ingrese la base: ");
        base = leer.nextDouble();
        System.out.printf("Ingrese la altura: ");
        altura = leer.nextDouble();

        area = base * altura;
        perimetro = 2 + (base * altura);

        System.out.println("\n -- Resultado --");

        System.out.println("El área es: " + area);
        System.out.printf("El perímetro es: " + perimetro);

    }
}
