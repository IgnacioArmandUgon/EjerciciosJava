package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese precio");
        double precio = teclado.nextDouble();
        double iva = (precio/100) * 21;
        precio = precio + iva;
        System.out.println("precio = " + precio);
    }
}
