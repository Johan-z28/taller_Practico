package Intermedio;
import  java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        double peso, estatura, imc, estaturacm;
        String estado;

        System.out.printf("Ingresa el peso: ");
        peso = Leer.nextDouble();
        System.out.printf("Ingresa el estatura: ");
        estatura = Leer.nextDouble();

        estaturacm = estatura/100;

        imc = peso/(estaturacm * estaturacm);

        if (imc < 18.5){
            estado = "bajo peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            estado = "normal";
        } else if (imc >= 25 && imc < 29.9) {
            estado = "sobrepeso";
        } else {
            estado = "obesidad";
        }

        System.out.println("\n-- Resultados --");
        System.out.printf("Tu IMC es --> %.2f", imc);
        System.out.println("\nTu estado es --> " + estado);
    }
}
