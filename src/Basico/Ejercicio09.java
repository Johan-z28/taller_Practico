package Basico;
import  java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int edad;
        String resultado = "";

        System.out.println("Ingrese su edad: ");
        edad = leer.nextInt();

        if (edad > 18) {
            resultado = ("mayor de edad");
        } else {
            resultado = "menor de edad";
        }

        System.out.println("\n-- Resultado --");
        System.out.println("La edad es: " + resultado);
    }
}

