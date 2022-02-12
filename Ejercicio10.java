package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su frase");
        String frase = entrada.nextLine();
        frase = frase.replace(" ", "");
        System.out.println("La frase pero sin espacios: "+frase);
    }
}
