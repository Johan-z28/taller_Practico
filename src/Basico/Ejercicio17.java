package Basico;


import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numero;

        System.out.printf("Digite numero a multiplicar: ");
        numero = leer.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
    }

}
