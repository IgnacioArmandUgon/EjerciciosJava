package Ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese dia de la semana");
        String dia = teclado.nextLine();

        switch (dia.toLowerCase()) {
            case "sabado":
            case "domingo":
                System.out.println("Es un dia NO laboral");
                break;
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
        }
    }
}
