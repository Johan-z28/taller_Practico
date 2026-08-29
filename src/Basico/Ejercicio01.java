package Basico;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {

        int edad = 21;
        String nombre = "Johan", resultado="";
        double estatura = 180;
        boolean estado = true;

        if (estado == true){
            resultado = "Activa";
        } else {
            resultado = "Innactiva";
        }

        System.out.println("Mi nombres es: " + nombre + " Tengo: " + edad + " de edad, " + "Mido: " + estatura + " Mi matricula esta: " + resultado);
    }
}
