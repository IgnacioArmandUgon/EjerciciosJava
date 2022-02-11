package Ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String fraseInclusiva = frase.replace('a', 'e');
        System.out.println("Ingresa TU frase");
        frase = teclado.nextLine();
        System.out.println(fraseInclusiva+ ". "+ frase);
    }
}
