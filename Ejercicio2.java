package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese numero  1");
        num1 = teclado.nextInt();
        System.out.println("Ingrese numero 2");
        num2 = teclado.nextInt();
        int mayor= Math.max(num1, num2);
        System.out.println("mayor = " + mayor);
    }
}
