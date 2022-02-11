package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = -1;
        while(!(numero >= 0)){
            System.out.println("Ingrese un numero");
            numero = teclado.nextInt();
        }
        System.out.println(numero+" es un numero natural!");
    }
}
