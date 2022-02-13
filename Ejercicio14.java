package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        System.out.println("Ingrese un numero");
        num = entrada.nextInt();

        while (num>1000){
            System.out.println("El numero debe ser menor que 1000");
            num = entrada.nextInt();
        }
        for (int i = num; i<=1000; i = i +2){
            System.out.println(i);
        }
    }

}
